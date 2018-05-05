package br.com.faesa.app.example;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import br.com.faesa.app.R;
import br.com.faesa.app.view.component.AppButton;
import br.com.faesa.app.view.dialog.LoadDialog;
import br.com.faesa.app.view.dialog.messagedialog.Alert;
import br.com.faesa.app.view.dialog.messagedialog.DialogButtonInfo;
import br.com.faesa.app.view.dialog.messagedialog.MessageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class DialogActivity extends AppCompatActivity {

    LoadDialog progressDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        progressDialog = new LoadDialog(this);

        findViewById(R.id.diaBtnMessageDialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessageDialog();
            }
        });

        findViewById(R.id.diaBtnProgress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgressDialog();
            }
        });
    }

    private void showMessageDialog() {
        final MessageDialog dialog = MessageDialog.Companion.newInstance(getAlert());

        dialog.setOnButtonClickListener(new Function1<Integer, Unit>() {
            @Override
            public Unit invoke(Integer integer) {
                Log.i("LATIFA", String.valueOf(integer));
                dialog.dismiss();
                return null;
            }
        });

        dialog.show(getSupportFragmentManager(), MessageDialog.TAG);
    }

    private void showProgressDialog() {
        progressDialog.show();

        startSleep();
    }

    private void startSleep() {
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                progressDialog.dismiss();
            }
        }.execute();
    }

    private Alert getAlert() {

        List<DialogButtonInfo> list = Arrays.asList(
                new DialogButtonInfo(AppButton.TYPE_NORMAL, 1, "Ok"),
                new DialogButtonInfo(AppButton.TYPE_GHOST, 2, "Cancelar")
        );

        return new Alert("Alerta", "Lorem ipsun", list);
    }
}

package br.com.faesa.app.view.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntDef;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.faesa.app.R;

public class AppButton extends AppCompatButton {

    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_GHOST = 1;
    public static final int TYPE_LINK = 2;

    public AppButton(Context context) {
        this(context, TYPE_NORMAL);
    }

    public AppButton(Context context, @AppButtonType int style) {
        super(context);
        setStyle(style);
    }

    public AppButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        render(attrs);
    }

    public AppButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        render(attrs);
    }

    private void render(AttributeSet attrs) {
        TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.AppButton, 0, 0);
        int type = typedArray.getInt(R.styleable.AppButton_type, TYPE_NORMAL);

        setStyle(type);

        typedArray.recycle();
    }

    public void setStyle(@AppButtonType int style) {
        switch (style) {
            case TYPE_NORMAL: renderNormalStyle(); break;
            case TYPE_GHOST: renderGhostStyle(); break;
        }
    }

    @IntDef({TYPE_NORMAL, TYPE_GHOST, TYPE_LINK})
    @Retention(RetentionPolicy.SOURCE)
    public @interface AppButtonType{}

    private void renderNormalStyle() {
        Drawable bgDrawable = ContextCompat.getDrawable(getContext(), R.drawable.btn_normal);
        int textColor = ContextCompat.getColor(getContext(), android.R.color.white);
        float fontSize = 15f;
        Typeface fontTypeface = Typeface.create("sans-serif-medium", Typeface.NORMAL);

        render(bgDrawable, textColor, fontSize, fontTypeface);
    }

    private void renderGhostStyle() {
        Drawable bgDrawable = ContextCompat.getDrawable(getContext(), R.drawable.btn_ghost);
        int textColor = ContextCompat.getColor(getContext(), R.color.app_color);
        float fontSize = 15f;
        Typeface fontTypeface = Typeface.create("sans-serif-medium", Typeface.NORMAL);

        render(bgDrawable, textColor, fontSize, fontTypeface);
    }

    private void render(Drawable bgDrawable, int textColor, float fontSize, Typeface fontTypeface) {
        setTypeface(fontTypeface);
        setBackgroundRetainPadding(bgDrawable);
        setTextColor(textColor);
        setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize);
    }

    private void setBackgroundRetainPadding(Drawable bgDrawable) {
        setBackground(bgDrawable);
        setPadding(pxToDp(22), getPaddingTop(), pxToDp(22), getPaddingBottom());
    }


    private int pxToDp(int dp){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getContext().getResources().getDisplayMetrics());
    }
}

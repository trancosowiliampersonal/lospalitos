package br.com.faesa.app.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDAO<E extends Entity> extends SQLiteOpenHelper {

    /* CONSTRUCTORS */
    public BaseDAO(Context context) {
        super(context, "database", null, 1);
    }

    /* CONTRACT */
    protected abstract E cursorToEntity(Cursor c);

    protected abstract ContentValues entityToContentValues(E entity);

    protected abstract String getTable();

    /* CRUD - CREATE */
    public void insert(E entity) {
        entity.setId(getWritableDatabase().insert(getTable(), null, entityToContentValues(entity)));
    }

    /* CRUD - READ */
    public List<E> getList() {
        Cursor c = getReadableDatabase().rawQuery("SELECT * FROM " + getTable(), null);
        return cursorToEntitys(c);
    }

    /* CRUD - READ */
    public E get(int id) {
        SQLiteDatabase db = getReadableDatabase();
        E retorno = null;
        Cursor c;

        try {
            c = db.rawQuery("SELECT * FROM " + getTable() + " WHERE id=?;", new String[]{id + ""});
            if (c.moveToNext()) {
                retorno = cursorToEntity(c);
            }
        } finally {
            c = null;
        }

        return retorno;
    }

    /* CRUD - UPDATE */
    public void update(E entity) {
        ContentValues cv = entityToContentValues(entity);
        cv.put("id", entity.getId());
        getWritableDatabase().update(getTable(), cv, DB.COLUMN_ID + " = ?", new String[]{entity.getId() + ""});
    }

    /* CRUD - DELETE */
    public void delete(E entity) {
        getWritableDatabase().delete(getTable(), DB.COLUMN_ID + " = ?", new String[]{entity.getId() + ""});
    }

    /* ACTIONS AUXILIARYS */
    public void save(E entity) {
        if (entity.getId() > 0) {
            update(entity);
        } else {
            insert(entity);
        }
    }

    /* OUTHERS */
    private List<E> cursorToEntitys(Cursor c) {
        ArrayList<E> list = new ArrayList<>();
        while (c.moveToNext()) {
            list.add(cursorToEntity(c));
        }
        return list;
    }
}
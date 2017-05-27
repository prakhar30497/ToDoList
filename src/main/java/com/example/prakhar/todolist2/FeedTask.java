package com.example.prakhar.todolist2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.prakhar.todolist2.FeedTask;

public class FeedTask {

    private SQLiteDatabase database;
    private final FeedTaskDbHelper dbHelper;

    public static final String TABLE_NAME = "taskrecords";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_NOTES = "notes";



    public FeedTask(Context context){
        dbHelper = new FeedTaskDbHelper(context);
        database = dbHelper.getWritableDatabase();
    }
    public void saveTask(String title, String notes){
        /*database.execSQL("INSERT INTO TASKRECORDS" +
                " (TITLE, NOTES)" +
                " VALUES('" + title + "', '" + notes + "')"

        );*/
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TITLE, title);
        contentValues.put(COLUMN_NOTES, notes);

        database.insert(TABLE_NAME, null, contentValues);
    }

    public Cursor getAllTaskRecords(){
        return database.rawQuery("select * from " + TABLE_NAME, null);
    }
}

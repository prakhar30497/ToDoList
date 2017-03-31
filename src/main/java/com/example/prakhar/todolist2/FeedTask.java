package com.example.prakhar.todolist2;

import android.provider.BaseColumns;

public final class FeedTask {
    private FeedTask(){}
    public static class FeedEntry implements BaseColumns{
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TASK = "task";
    }

}

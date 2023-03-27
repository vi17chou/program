import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQlite2 extends SQLiteOpenHelper {
    private final static String DataBaseName="DataBaseIt";
    private final static int DataBaseVersion=1;
    public SQlite2(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        //super(context, name, factory, version);
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SqlTable = "CREATE TABLE IF NOT EXISTS Users (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "name text not null,"+
                "age text not null,"+
                "sex int not null,"+
                "acc text not null,"+
                "pwd int not null,"+
                "check_pwd not null,"+
                "Faraction int not null"+
                ")";
        sqLiteDatabase.execSQL(SqlTable);
    }

//123
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        final  String SQL ="DROP TABLE Users";
        sqLiteDatabase.execSQL(SQL);
    }
}

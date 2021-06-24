package uz.tatunf.programming.data;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import uz.tatunf.programming.data.model.Languages;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LangDao_Impl implements LangDao {
  private final RoomDatabase __db;

  public LangDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<Languages> getAllThemes() {
    final String _sql = "SELECT * FROM lang";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final List<Languages> _result = new ArrayList<Languages>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Languages _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDesc;
        _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        _item = new Languages(_tmpId,_tmpName,_tmpDesc);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Languages getInfo(final int pos) {
    final String _sql = "SELECT * FROM lang WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pos);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final Languages _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDesc;
        _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        _result = new Languages(_tmpId,_tmpName,_tmpDesc);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}

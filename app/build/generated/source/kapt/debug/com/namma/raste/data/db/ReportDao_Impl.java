package com.namma.raste.data.db;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.namma.raste.data.model.Report;
import java.lang.Class;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class ReportDao_Impl implements ReportDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<Report> __insertAdapterOfReport;

  public ReportDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfReport = new EntityInsertAdapter<Report>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `reports` (`ticketId`,`userId`,`photoPath`,`issueType`,`severity`,`latitude`,`longitude`,`timestamp`,`status`,`aiConfidence`,`description`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement, @NonNull final Report entity) {
        if (entity.getTicketId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getTicketId());
        }
        if (entity.getUserId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getUserId());
        }
        if (entity.getPhotoPath() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getPhotoPath());
        }
        if (entity.getIssueType() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getIssueType());
        }
        if (entity.getSeverity() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getSeverity());
        }
        statement.bindDouble(6, entity.getLatitude());
        statement.bindDouble(7, entity.getLongitude());
        statement.bindLong(8, entity.getTimestamp());
        if (entity.getStatus() == null) {
          statement.bindNull(9);
        } else {
          statement.bindText(9, entity.getStatus());
        }
        statement.bindLong(10, entity.getAiConfidence());
        if (entity.getDescription() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getDescription());
        }
      }
    };
  }

  @Override
  public Object insertReport(final Report report, final Continuation<? super Unit> $completion) {
    if (report == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfReport.insert(_connection, report);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public LiveData<List<Report>> getAllReports() {
    final String _sql = "SELECT * FROM reports ORDER BY timestamp DESC";
    return __db.getInvalidationTracker().createLiveData(new String[] {"reports"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfTicketId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ticketId");
        final int _columnIndexOfUserId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "userId");
        final int _columnIndexOfPhotoPath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "photoPath");
        final int _columnIndexOfIssueType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "issueType");
        final int _columnIndexOfSeverity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "severity");
        final int _columnIndexOfLatitude = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "latitude");
        final int _columnIndexOfLongitude = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "longitude");
        final int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
        final int _columnIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
        final int _columnIndexOfAiConfidence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "aiConfidence");
        final int _columnIndexOfDescription = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "description");
        final List<Report> _result = new ArrayList<Report>();
        while (_stmt.step()) {
          final Report _item;
          final String _tmpTicketId;
          if (_stmt.isNull(_columnIndexOfTicketId)) {
            _tmpTicketId = null;
          } else {
            _tmpTicketId = _stmt.getText(_columnIndexOfTicketId);
          }
          final String _tmpUserId;
          if (_stmt.isNull(_columnIndexOfUserId)) {
            _tmpUserId = null;
          } else {
            _tmpUserId = _stmt.getText(_columnIndexOfUserId);
          }
          final String _tmpPhotoPath;
          if (_stmt.isNull(_columnIndexOfPhotoPath)) {
            _tmpPhotoPath = null;
          } else {
            _tmpPhotoPath = _stmt.getText(_columnIndexOfPhotoPath);
          }
          final String _tmpIssueType;
          if (_stmt.isNull(_columnIndexOfIssueType)) {
            _tmpIssueType = null;
          } else {
            _tmpIssueType = _stmt.getText(_columnIndexOfIssueType);
          }
          final String _tmpSeverity;
          if (_stmt.isNull(_columnIndexOfSeverity)) {
            _tmpSeverity = null;
          } else {
            _tmpSeverity = _stmt.getText(_columnIndexOfSeverity);
          }
          final double _tmpLatitude;
          _tmpLatitude = _stmt.getDouble(_columnIndexOfLatitude);
          final double _tmpLongitude;
          _tmpLongitude = _stmt.getDouble(_columnIndexOfLongitude);
          final long _tmpTimestamp;
          _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
          final String _tmpStatus;
          if (_stmt.isNull(_columnIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _stmt.getText(_columnIndexOfStatus);
          }
          final int _tmpAiConfidence;
          _tmpAiConfidence = (int) (_stmt.getLong(_columnIndexOfAiConfidence));
          final String _tmpDescription;
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription);
          }
          _item = new Report(_tmpTicketId,_tmpUserId,_tmpPhotoPath,_tmpIssueType,_tmpSeverity,_tmpLatitude,_tmpLongitude,_tmpTimestamp,_tmpStatus,_tmpAiConfidence,_tmpDescription);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object getReportByTicketId(final String ticketId,
      final Continuation<? super Report> $completion) {
    final String _sql = "SELECT * FROM reports WHERE ticketId = ? LIMIT 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (ticketId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, ticketId);
        }
        final int _columnIndexOfTicketId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ticketId");
        final int _columnIndexOfUserId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "userId");
        final int _columnIndexOfPhotoPath = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "photoPath");
        final int _columnIndexOfIssueType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "issueType");
        final int _columnIndexOfSeverity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "severity");
        final int _columnIndexOfLatitude = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "latitude");
        final int _columnIndexOfLongitude = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "longitude");
        final int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
        final int _columnIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
        final int _columnIndexOfAiConfidence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "aiConfidence");
        final int _columnIndexOfDescription = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "description");
        final Report _result;
        if (_stmt.step()) {
          final String _tmpTicketId;
          if (_stmt.isNull(_columnIndexOfTicketId)) {
            _tmpTicketId = null;
          } else {
            _tmpTicketId = _stmt.getText(_columnIndexOfTicketId);
          }
          final String _tmpUserId;
          if (_stmt.isNull(_columnIndexOfUserId)) {
            _tmpUserId = null;
          } else {
            _tmpUserId = _stmt.getText(_columnIndexOfUserId);
          }
          final String _tmpPhotoPath;
          if (_stmt.isNull(_columnIndexOfPhotoPath)) {
            _tmpPhotoPath = null;
          } else {
            _tmpPhotoPath = _stmt.getText(_columnIndexOfPhotoPath);
          }
          final String _tmpIssueType;
          if (_stmt.isNull(_columnIndexOfIssueType)) {
            _tmpIssueType = null;
          } else {
            _tmpIssueType = _stmt.getText(_columnIndexOfIssueType);
          }
          final String _tmpSeverity;
          if (_stmt.isNull(_columnIndexOfSeverity)) {
            _tmpSeverity = null;
          } else {
            _tmpSeverity = _stmt.getText(_columnIndexOfSeverity);
          }
          final double _tmpLatitude;
          _tmpLatitude = _stmt.getDouble(_columnIndexOfLatitude);
          final double _tmpLongitude;
          _tmpLongitude = _stmt.getDouble(_columnIndexOfLongitude);
          final long _tmpTimestamp;
          _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
          final String _tmpStatus;
          if (_stmt.isNull(_columnIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _stmt.getText(_columnIndexOfStatus);
          }
          final int _tmpAiConfidence;
          _tmpAiConfidence = (int) (_stmt.getLong(_columnIndexOfAiConfidence));
          final String _tmpDescription;
          if (_stmt.isNull(_columnIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _stmt.getText(_columnIndexOfDescription);
          }
          _result = new Report(_tmpTicketId,_tmpUserId,_tmpPhotoPath,_tmpIssueType,_tmpSeverity,_tmpLatitude,_tmpLongitude,_tmpTimestamp,_tmpStatus,_tmpAiConfidence,_tmpDescription);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getReportCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM reports";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final Integer _result;
        if (_stmt.step()) {
          final Integer _tmp;
          if (_stmt.isNull(0)) {
            _tmp = null;
          } else {
            _tmp = (int) (_stmt.getLong(0));
          }
          _result = _tmp;
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object markAsResolved(final String ticketId,
      final Continuation<? super Unit> $completion) {
    final String _sql = "UPDATE reports SET status = 'RESOLVED' WHERE ticketId = ?";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (ticketId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, ticketId);
        }
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

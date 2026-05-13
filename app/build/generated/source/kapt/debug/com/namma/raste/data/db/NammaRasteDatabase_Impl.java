package com.namma.raste.data.db;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class NammaRasteDatabase_Impl extends NammaRasteDatabase {
  private volatile ReportDao _reportDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(4, "41214ad800b6558134148086ffda33d7", "1732d4e1bbf56f5e54bf424185d3fcaa") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `reports` (`ticketId` TEXT NOT NULL, `userId` TEXT NOT NULL, `photoPath` TEXT NOT NULL, `issueType` TEXT NOT NULL, `severity` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `timestamp` INTEGER NOT NULL, `status` TEXT NOT NULL, `aiConfidence` INTEGER NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`ticketId`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '41214ad800b6558134148086ffda33d7')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `reports`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsReports = new HashMap<String, TableInfo.Column>(11);
        _columnsReports.put("ticketId", new TableInfo.Column("ticketId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("photoPath", new TableInfo.Column("photoPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("issueType", new TableInfo.Column("issueType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("severity", new TableInfo.Column("severity", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("aiConfidence", new TableInfo.Column("aiConfidence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReports.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysReports = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesReports = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReports = new TableInfo("reports", _columnsReports, _foreignKeysReports, _indicesReports);
        final TableInfo _existingReports = TableInfo.read(connection, "reports");
        if (!_infoReports.equals(_existingReports)) {
          return new RoomOpenDelegate.ValidationResult(false, "reports(com.namma.raste.data.model.Report).\n"
                  + " Expected:\n" + _infoReports + "\n"
                  + " Found:\n" + _existingReports);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "reports");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "reports");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ReportDao.class, ReportDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public ReportDao reportDao() {
    if (_reportDao != null) {
      return _reportDao;
    } else {
      synchronized(this) {
        if(_reportDao == null) {
          _reportDao = new ReportDao_Impl(this);
        }
        return _reportDao;
      }
    }
  }
}

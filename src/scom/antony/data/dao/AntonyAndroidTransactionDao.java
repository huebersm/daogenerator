package scom.antony.data.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import scom.antony.data.dao.AntonyAndroidTransaction;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ANTONY_ANDROID_TRANSACTION.
*/
public class AntonyAndroidTransactionDao extends AbstractDao<AntonyAndroidTransaction, Void> {

    public static final String TABLENAME = "ANTONY_ANDROID_TRANSACTION";

    /**
     * Properties of entity AntonyAndroidTransaction.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property TAddinID = new Property(0, long.class, "tAddinID", false, "T_ADDIN_ID");
        public final static Property TObjectID = new Property(1, long.class, "tObjectID", false, "T_OBJECT_ID");
        public final static Property TType = new Property(2, Integer.class, "tType", false, "T_TYPE");
    };


    public AntonyAndroidTransactionDao(DaoConfig config) {
        super(config);
    }
    
    public AntonyAndroidTransactionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ANTONY_ANDROID_TRANSACTION' (" + //
                "'T_ADDIN_ID' INTEGER NOT NULL ," + // 0: tAddinID
                "'T_OBJECT_ID' INTEGER NOT NULL ," + // 1: tObjectID
                "'T_TYPE' INTEGER);"); // 2: tType
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_ANTONY_ANDROID_TRANSACTION_T_ADDIN_ID_T_OBJECT_ID ON ANTONY_ANDROID_TRANSACTION" +
                " (T_ADDIN_ID,T_OBJECT_ID);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ANTONY_ANDROID_TRANSACTION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AntonyAndroidTransaction entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getTAddinID());
        stmt.bindLong(2, entity.getTObjectID());
 
        Integer tType = entity.getTType();
        if (tType != null) {
            stmt.bindLong(3, tType);
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public AntonyAndroidTransaction readEntity(Cursor cursor, int offset) {
        AntonyAndroidTransaction entity = new AntonyAndroidTransaction( //
            cursor.getLong(offset + 0), // tAddinID
            cursor.getLong(offset + 1), // tObjectID
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2) // tType
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AntonyAndroidTransaction entity, int offset) {
        entity.setTAddinID(cursor.getLong(offset + 0));
        entity.setTObjectID(cursor.getLong(offset + 1));
        entity.setTType(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected Void updateKeyAfterInsert(AntonyAndroidTransaction entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(AntonyAndroidTransaction entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
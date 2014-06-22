package com.braunster.chatsdk.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.braunster.chatsdk.dao.BUser;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table BUSER.
*/
public class BUserDao extends AbstractDao<BUser, Long> {

    public static final String TABLENAME = "BUSER";

    /**
     * Properties of entity BUser.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property EntityID = new Property(1, String.class, "entityID", false, "ENTITY_ID");
        public final static Property Authentication_id = new Property(2, String.class, "authentication_id", false, "AUTHENTICATION_ID");
        public final static Property FacebookID = new Property(3, String.class, "facebookID", false, "FACEBOOK_ID");
        public final static Property Dirty = new Property(4, Boolean.class, "dirty", false, "DIRTY");
        public final static Property Name = new Property(5, String.class, "name", false, "NAME");
        public final static Property LastOnline = new Property(6, java.util.Date.class, "lastOnline", false, "LAST_ONLINE");
        public final static Property LastUpdated = new Property(7, java.util.Date.class, "lastUpdated", false, "LAST_UPDATED");
        public final static Property Online = new Property(8, Boolean.class, "Online", false, "ONLINE");
        public final static Property FontSize = new Property(9, Integer.class, "fontSize", false, "FONT_SIZE");
        public final static Property FontName = new Property(10, String.class, "fontName", false, "FONT_NAME");
        public final static Property TextColor = new Property(11, String.class, "textColor", false, "TEXT_COLOR");
    };

    private DaoSession daoSession;


    public BUserDao(DaoConfig config) {
        super(config);
    }
    
    public BUserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'BUSER' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'ENTITY_ID' TEXT," + // 1: entityID
                "'AUTHENTICATION_ID' TEXT," + // 2: authentication_id
                "'FACEBOOK_ID' TEXT," + // 3: facebookID
                "'DIRTY' INTEGER," + // 4: dirty
                "'NAME' TEXT," + // 5: name
                "'LAST_ONLINE' INTEGER," + // 6: lastOnline
                "'LAST_UPDATED' INTEGER," + // 7: lastUpdated
                "'ONLINE' INTEGER," + // 8: Online
                "'FONT_SIZE' INTEGER," + // 9: fontSize
                "'FONT_NAME' TEXT," + // 10: fontName
                "'TEXT_COLOR' TEXT);"); // 11: textColor
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'BUSER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, BUser entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String entityID = entity.getEntityID();
        if (entityID != null) {
            stmt.bindString(2, entityID);
        }
 
        String authentication_id = entity.getAuthentication_id();
        if (authentication_id != null) {
            stmt.bindString(3, authentication_id);
        }
 
        String facebookID = entity.getFacebookID();
        if (facebookID != null) {
            stmt.bindString(4, facebookID);
        }
 
        Boolean dirty = entity.getDirty();
        if (dirty != null) {
            stmt.bindLong(5, dirty ? 1l: 0l);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(6, name);
        }
 
        java.util.Date lastOnline = entity.getLastOnline();
        if (lastOnline != null) {
            stmt.bindLong(7, lastOnline.getTime());
        }
 
        java.util.Date lastUpdated = entity.getLastUpdated();
        if (lastUpdated != null) {
            stmt.bindLong(8, lastUpdated.getTime());
        }
 
        Boolean Online = entity.getOnline();
        if (Online != null) {
            stmt.bindLong(9, Online ? 1l: 0l);
        }
 
        Integer fontSize = entity.getFontSize();
        if (fontSize != null) {
            stmt.bindLong(10, fontSize);
        }
 
        String fontName = entity.getFontName();
        if (fontName != null) {
            stmt.bindString(11, fontName);
        }
 
        String textColor = entity.getTextColor();
        if (textColor != null) {
            stmt.bindString(12, textColor);
        }
    }

    @Override
    protected void attachEntity(BUser entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public BUser readEntity(Cursor cursor, int offset) {
        BUser entity = new BUser( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // entityID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // authentication_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // facebookID
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // dirty
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // name
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)), // lastOnline
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // lastUpdated
            cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0, // Online
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // fontSize
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // fontName
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // textColor
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BUser entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEntityID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAuthentication_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFacebookID(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDirty(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setLastOnline(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
        entity.setLastUpdated(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setOnline(cursor.isNull(offset + 8) ? null : cursor.getShort(offset + 8) != 0);
        entity.setFontSize(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setFontName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTextColor(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(BUser entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(BUser entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
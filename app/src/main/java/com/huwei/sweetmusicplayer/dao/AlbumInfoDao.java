package com.huwei.sweetmusicplayer.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.huwei.sweetmusicplayer.models.AlbumInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ALBUM_INFO.
*/
public class AlbumInfoDao extends AbstractDao<AlbumInfo, Long> {

    public static final String TABLENAME = "ALBUM_INFO";

    /**
     * Properties of entity AlbumInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property AlbumId = new Property(0, Long.class, "albumId", true, "ALBUM_ID");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property ArtistId = new Property(2, Long.class, "artistId", false, "ARTIST_ID");
        public final static Property Artist = new Property(3, String.class, "artist", false, "ARTIST");
        public final static Property NumSongs = new Property(4, Integer.class, "numSongs", false, "NUM_SONGS");
        public final static Property AlbumArt = new Property(5, String.class, "albumArt", false, "ALBUM_ART");
    };


    public AlbumInfoDao(DaoConfig config) {
        super(config);
    }
    
    public AlbumInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ALBUM_INFO' (" + //
                "'ALBUM_ID' INTEGER PRIMARY KEY ," + // 0: albumId
                "'TITLE' TEXT," + // 1: title
                "'ARTIST_ID' INTEGER," + // 2: artistId
                "'ARTIST' TEXT," + // 3: artist
                "'NUM_SONGS' INTEGER," + // 4: numSongs
                "'ALBUM_ART' TEXT);"); // 5: albumArt
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ALBUM_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AlbumInfo entity) {
        stmt.clearBindings();
 
        Long albumId = entity.getAlbumId();
        if (albumId != null) {
            stmt.bindLong(1, albumId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        Long artistId = entity.getArtistId();
        if (artistId != null) {
            stmt.bindLong(3, artistId);
        }
 
        String artist = entity.getArtist();
        if (artist != null) {
            stmt.bindString(4, artist);
        }
 
        Integer numSongs = entity.getNumSongs();
        if (numSongs != null) {
            stmt.bindLong(5, numSongs);
        }
 
        String albumArt = entity.getAlbumArt();
        if (albumArt != null) {
            stmt.bindString(6, albumArt);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AlbumInfo readEntity(Cursor cursor, int offset) {
        AlbumInfo entity = new AlbumInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // albumId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // artistId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // artist
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // numSongs
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // albumArt
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AlbumInfo entity, int offset) {
        entity.setAlbumId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setArtistId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setArtist(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNumSongs(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setAlbumArt(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AlbumInfo entity, long rowId) {
        entity.setAlbumId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AlbumInfo entity) {
        if(entity != null) {
            return entity.getAlbumId();
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

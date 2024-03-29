package scom.antony.data.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import scom.antony.data.dao.AntonyObjectDaoW;
import scom.antony.data.dao.AntonyFlexListDaoW;
import scom.antony.data.dao.AntonyAndroidTransaction;

import scom.antony.data.dao.AntonyObjectDaoWDao;
import scom.antony.data.dao.AntonyFlexListDaoWDao;
import scom.antony.data.dao.AntonyAndroidTransactionDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig antonyObjectDaoWDaoConfig;
    private final DaoConfig antonyFlexListDaoWDaoConfig;
    private final DaoConfig antonyAndroidTransactionDaoConfig;

    private final AntonyObjectDaoWDao antonyObjectDaoWDao;
    private final AntonyFlexListDaoWDao antonyFlexListDaoWDao;
    private final AntonyAndroidTransactionDao antonyAndroidTransactionDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        antonyObjectDaoWDaoConfig = daoConfigMap.get(AntonyObjectDaoWDao.class).clone();
        antonyObjectDaoWDaoConfig.initIdentityScope(type);

        antonyFlexListDaoWDaoConfig = daoConfigMap.get(AntonyFlexListDaoWDao.class).clone();
        antonyFlexListDaoWDaoConfig.initIdentityScope(type);

        antonyAndroidTransactionDaoConfig = daoConfigMap.get(AntonyAndroidTransactionDao.class).clone();
        antonyAndroidTransactionDaoConfig.initIdentityScope(type);

        antonyObjectDaoWDao = new AntonyObjectDaoWDao(antonyObjectDaoWDaoConfig, this);
        antonyFlexListDaoWDao = new AntonyFlexListDaoWDao(antonyFlexListDaoWDaoConfig, this);
        antonyAndroidTransactionDao = new AntonyAndroidTransactionDao(antonyAndroidTransactionDaoConfig, this);

        registerDao(AntonyObjectDaoW.class, antonyObjectDaoWDao);
        registerDao(AntonyFlexListDaoW.class, antonyFlexListDaoWDao);
        registerDao(AntonyAndroidTransaction.class, antonyAndroidTransactionDao);
    }
    
    public void clear() {
        antonyObjectDaoWDaoConfig.getIdentityScope().clear();
        antonyFlexListDaoWDaoConfig.getIdentityScope().clear();
        antonyAndroidTransactionDaoConfig.getIdentityScope().clear();
    }

    public AntonyObjectDaoWDao getAntonyObjectDaoWDao() {
        return antonyObjectDaoWDao;
    }

    public AntonyFlexListDaoWDao getAntonyFlexListDaoWDao() {
        return antonyFlexListDaoWDao;
    }

    public AntonyAndroidTransactionDao getAntonyAndroidTransactionDao() {
        return antonyAndroidTransactionDao;
    }

}

package repository;

import model.Prodi;

public class ProdiTbl {
    private Database db;

    public ProdiTbl(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.tables.dataProdi.add(prodi);
        db.commit();
    }
    public Prodi getProdiById(String id) {
        for (Prodi prodi : db.tables.dataProdi) {
            if (prodi.getId().equals(id)) {
                return prodi;
            }
        }
        return null;
    } 
}
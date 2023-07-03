package sample.clientPac;

import javafx.beans.property.SimpleStringProperty;

public class Client {

    private final SimpleStringProperty id;

    private  final SimpleStringProperty fam;

    private  final SimpleStringProperty name;

    private  final SimpleStringProperty otch;

    private  final SimpleStringProperty date;

    private  final SimpleStringProperty pol;

    private  final SimpleStringProperty serP;

    private  final SimpleStringProperty nomP;

    private  final SimpleStringProperty vidan;

    private  final SimpleStringProperty dateV;

    private  final SimpleStringProperty idn;

    private  final SimpleStringProperty mesto;

    private  final SimpleStringProperty gor;

    private  final SimpleStringProperty adr;

    private  final SimpleStringProperty teld;

    private  final SimpleStringProperty telm;

    private  final SimpleStringProperty mail;

    private  final SimpleStringProperty rab;

    private  final SimpleStringProperty dol;

    private  final SimpleStringProperty gorp;

    private  final SimpleStringProperty adrp;

    private  final SimpleStringProperty sp;

    private  final SimpleStringProperty grag;

    private  final SimpleStringProperty inv;

    private  final SimpleStringProperty pens;

    private  final SimpleStringProperty doh;

    private  final SimpleStringProperty vo;



    public Client(String id, String fam, String name, String otch, String date, String pol, String serP, String nomP, String vidan, String dateV, String idn, String mesto, String gor, String adr, String teld, String telm, String mail, String rab, String dol, String gorp, String adrp, String sp, String grag, String inv, String pens, String doh, String vo) {
        this.id = new SimpleStringProperty(id);
        this.fam = new SimpleStringProperty(fam);
        this.name = new SimpleStringProperty(name);
        this.otch = new SimpleStringProperty(otch);
        this.date = new SimpleStringProperty(date);
        this.pol = new SimpleStringProperty(pol);
        this.serP = new SimpleStringProperty(serP);
        this.nomP = new SimpleStringProperty(nomP);
        this.vidan = new SimpleStringProperty(vidan);
        this.dateV = new SimpleStringProperty(dateV);
        this.idn = new SimpleStringProperty(idn);
        this.mesto = new SimpleStringProperty(mesto);
        this.gor = new SimpleStringProperty(gor);
        this.adr = new SimpleStringProperty(adr);
        this.teld = new SimpleStringProperty(teld);
        this.telm = new SimpleStringProperty(telm);
        this.mail = new SimpleStringProperty(mail);
        this.rab = new SimpleStringProperty(rab);
        this.dol = new SimpleStringProperty(dol);
        this.gorp = new SimpleStringProperty(gorp);
        this.adrp = new SimpleStringProperty(adrp);
        this.sp = new SimpleStringProperty(sp);
        this.grag = new SimpleStringProperty(grag);
        this.inv = new SimpleStringProperty(inv);
        this.pens = new SimpleStringProperty(pens);
        this.doh = new SimpleStringProperty(doh);
        this.vo = new SimpleStringProperty(vo);
    }

    public Client() {

        this.id = new SimpleStringProperty("");
        this.fam = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.otch = new SimpleStringProperty("");
        this.date = new SimpleStringProperty("");
        this.pol = new SimpleStringProperty("");
        this.serP = new SimpleStringProperty("");
        this.nomP = new SimpleStringProperty("");
        this.vidan = new SimpleStringProperty("");
        this.dateV = new SimpleStringProperty("");
        this.idn = new SimpleStringProperty("");
        this.mesto = new SimpleStringProperty("");
        this.gor = new SimpleStringProperty("");
        this.adr = new SimpleStringProperty("");
        this.teld = new SimpleStringProperty("");
        this.telm = new SimpleStringProperty("");
        this.mail = new SimpleStringProperty("");
        this.rab = new SimpleStringProperty("");
        this.dol = new SimpleStringProperty("");
        this.gorp = new SimpleStringProperty("");
        this.adrp = new SimpleStringProperty("");
        this.sp = new SimpleStringProperty("");
        this.grag = new SimpleStringProperty("");
        this.inv = new SimpleStringProperty("");
        this.pens = new SimpleStringProperty("");
        this.doh = new SimpleStringProperty("");
        this.vo = new SimpleStringProperty("");

    }

    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getFam() {
        return fam.get();
    }

    public SimpleStringProperty famProperty() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam.set(fam);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getOtch() {
        return otch.get();
    }

    public SimpleStringProperty otchProperty() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch.set(otch);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getPol() {
        return pol.get();
    }

    public SimpleStringProperty polProperty() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol.set(pol);
    }

    public String getSerP() {
        return serP.get();
    }

    public SimpleStringProperty serPProperty() {
        return serP;
    }

    public void setSerP(String serP) {
        this.serP.set(serP);
    }

    public String getNomP() {
        return nomP.get();
    }

    public SimpleStringProperty nomPProperty() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP.set(nomP);
    }

    public String getVidan() {
        return vidan.get();
    }

    public SimpleStringProperty vidanProperty() {
        return vidan;
    }

    public void setVidan(String vidan) {
        this.vidan.set(vidan);
    }

    public String getDateV() {
        return dateV.get();
    }

    public SimpleStringProperty dateVProperty() {
        return dateV;
    }

    public void setDateV(String dateV) {
        this.dateV.set(dateV);
    }

    public String getIdn() {
        return idn.get();
    }

    public SimpleStringProperty idnProperty() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn.set(idn);
    }

    public String getMesto() {
        return mesto.get();
    }

    public SimpleStringProperty mestoProperty() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto.set(mesto);
    }

    public String getGor() {
        return gor.get();
    }

    public SimpleStringProperty gorProperty() {
        return gor;
    }

    public void setGor(String gor) {
        this.gor.set(gor);
    }

    public String getAdr() {
        return adr.get();
    }

    public SimpleStringProperty adrProperty() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr.set(adr);
    }

    public String getTeld() {
        return teld.get();
    }

    public SimpleStringProperty teldProperty() {
        return teld;
    }

    public void setTeld(String teld) {
        this.teld.set(teld);
    }

    public String getTelm() {
        return telm.get();
    }

    public SimpleStringProperty telmProperty() {
        return telm;
    }

    public void setTelm(String telm) {
        this.telm.set(telm);
    }

    public String getMail() {
        return mail.get();
    }

    public SimpleStringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getRab() {
        return rab.get();
    }

    public SimpleStringProperty rabProperty() {
        return rab;
    }

    public void setRab(String rab) {
        this.rab.set(rab);
    }

    public String getDol() {
        return dol.get();
    }

    public SimpleStringProperty dolProperty() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol.set(dol);
    }

    public String getGorp() {
        return gorp.get();
    }

    public SimpleStringProperty gorpProperty() {
        return gorp;
    }

    public void setGorp(String gorp) {
        this.gorp.set(gorp);
    }

    public String getAdrp() {
        return adrp.get();
    }

    public SimpleStringProperty adrpProperty() {
        return adrp;
    }

    public void setAdrp(String adrp) {
        this.adrp.set(adrp);
    }

    public String getSp() {
        return sp.get();
    }

    public SimpleStringProperty spProperty() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp.set(sp);
    }

    public String getGrag() {
        return grag.get();
    }

    public SimpleStringProperty gragProperty() {
        return grag;
    }

    public void setGrag(String grag) {
        this.grag.set(grag);
    }

    public String getInv() {
        return inv.get();
    }

    public SimpleStringProperty invProperty() {
        return inv;
    }

    public void setInv(String inv) {
        this.inv.set(inv);
    }

    public String getPens() {
        return pens.get();
    }

    public SimpleStringProperty pensProperty() {
        return pens;
    }

    public void setPens(String pens) {
        this.pens.set(pens);
    }

    public String getDoh() {
        return doh.get();
    }

    public SimpleStringProperty dohProperty() {
        return doh;
    }

    public void setDoh(String doh) {
        this.doh.set(doh);
    }

    public String getVo() {
        return vo.get();
    }

    public SimpleStringProperty voProperty() {
        return vo;
    }

    public void setVo(String vo) {
        this.vo.set(vo);
    }

/*
    public String getId() {
        return id.get();
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getFam() {
        return fam.get();
    }

    public SimpleStringProperty famProperty() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam.set(fam);
    }

    public String getKol() {
        return name.get();
    }

    public SimpleStringProperty kolProperty() {
        return name;
    }

    public void setKol(String kol) {
        this.name.set(kol);
    }

    public String getSum() {
        return otch.get();
    }

    public SimpleStringProperty sumProperty() {
        return otch;
    }

    public void setSum(String sum) {
        this.otch.set(sum);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }
    */
}

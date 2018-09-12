/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author italo.francis
 */
public class Altere implements Comparable<Altere>{
    
    private String numSerie;
    private String MAC;
    private String numRel; 
    private String tpFonte;
    private String tpCarga;
    private String rtc;
    private String date;
    private String CIX1;
    private String CIX2;
    private String CIX3;
    private String CIXN;
    private String CUX1;
    private String CUX2;
    private String CUX3;
    private String CUX4;
    private String CUX5;
    private String CUX6;

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getRtc() {
        return rtc;
    }

    public void setRtc(String rtc) {
        this.rtc = rtc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
    
    
    public String getTpFonte() {
        return tpFonte;
    }

    public void setTpFonte(String tpFonte) {
        this.tpFonte = tpFonte;
    }

    public String getTpCarga() {
        return tpCarga;
    }

    public void setTpCarga(String tpCarga) {
        this.tpCarga = tpCarga;
    }

    public String getNumRel() {
        return numRel;
    }

    public void setNumRel(String numRel) {
        this.numRel = numRel;
    }

    public String getCIX1() {
        return CIX1;
    }

    public void setCIX1(String CIX1) {
        this.CIX1 = CIX1;
    }

    public String getCIX2() {
        return CIX2;
    }

    public void setCIX2(String CIX2) {
        this.CIX2 = CIX2;
    }

    public String getCIX3() {
        return CIX3;
    }

    public void setCIX3(String CIX3) {
        this.CIX3 = CIX3;
    }

    public String getCIXN() {
        return CIXN;
    }

    public void setCIXN(String CIXN) {
        this.CIXN = CIXN;
    }

    public String getCUX1() {
        return CUX1;
    }

    public void setCUX1(String CUX1) {
        this.CUX1 = CUX1;
    }

    public String getCUX2() {
        return CUX2;
    }

    public void setCUX2(String CUX2) {
        this.CUX2 = CUX2;
    }

    
    public String getCUX3() {
        return CUX3;
    }

    public void setCUX3(String CUX3) {
        this.CUX3 = CUX3;
    }

    public String getCUX4() {
        return CUX4;
    }

    public void setCUX4(String CUX4) {
        this.CUX4 = CUX4;
    }

    public String getCUX5() {
        return CUX5;
    }

    public void setCUX5(String CUX5) {
        this.CUX5 = CUX5;
    }

    public String getCUX6() {
        return CUX6;
    }

    public void setCUX6(String CUX6) {
        this.CUX6 = CUX6;
    }

   
    
  
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Altere other = (Altere) obj;
        if (!Objects.equals(this.numSerie, other.numSerie)) {
            return false;
        }
        if (!Objects.equals(this.MAC, other.MAC)) {
            return false;
        }
        if (!Objects.equals(this.numRel, other.numRel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Altere: " + "Serie = " + numSerie + ", MAC = " + MAC + ", Religador = " + numRel + 
                ", CIX1 = " + CIX1 + ", CIX2 = " + CIX2 + ", CIX3 = " + CIX3 + ", CIXN = " + CIXN +
                ", CUX1 = " + CUX1 + ", CUX2 = " + CUX2 + ", CUX3 = " + CUX3 + ", CUX4 = " + CUX4 + 
                ", CUX5 = " + CUX5 + ", CUX6 = " + CUX6;
    }

    

   

    @Override
    public int compareTo(Altere altere) {
       
		
          return  numSerie.compareTo(altere.getNumSerie());
      
	}
   
    

   
    
    
    
    
    
    
}

package com.mano.learnabc;

public class Alphabet {
    public String alphabet;
    public  int imgResource;

    public Alphabet(String alphabet, int imgResource) {
        this.alphabet = alphabet;
        this.imgResource = imgResource;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}

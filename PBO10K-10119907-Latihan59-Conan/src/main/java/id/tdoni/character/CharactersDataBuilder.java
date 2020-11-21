package id.tdoni.character;

final class CharactersDataBuilder {
    private String namaLengkap;
    private int umur;
    private float tinggi;
    private float berat;
    private Gender gender;

    CharactersDataBuilder setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
        return this;
    }

    CharactersDataBuilder setUmur(int umur) {
        this.umur = umur;
        return this;
    }

    CharactersDataBuilder setTinggi(float tinggi) {
        this.tinggi = tinggi;
        return this;
    }

    CharactersDataBuilder setBerat(float berat) {
        this.berat = berat;
        return this;
    }

    CharactersDataBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    CharactersData createCharacterData() {
        return new CharactersData(namaLengkap, umur, tinggi, berat, gender);
    }
}

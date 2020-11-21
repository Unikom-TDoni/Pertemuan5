/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.character;


/**
 *
 * @author ACER
 */
final class DetectiveCharactersDataBuilder {
    private int totalKasusTerselesaikan;
    private String nickName;
    private String teritory;

    DetectiveCharactersDataBuilder setTotalKasusTerselesaikan(int totalKasusTerselesaikan) {
        this.totalKasusTerselesaikan = totalKasusTerselesaikan;
        return this;
    }

    DetectiveCharactersDataBuilder setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    DetectiveCharactersDataBuilder setTeritory(String teritory) {
        this.teritory = teritory;
        return this;
    }

    DetectiveCharactersData createDetectiveData() {
        return new DetectiveCharactersData(totalKasusTerselesaikan, nickName, teritory);
    }
}

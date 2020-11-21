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
final class DetectiveCharactersData {
    final int totalKasusTerselesaikan;
    final String nickName;
    final String teritory;

    DetectiveCharactersData(int totalKasusTerselesaikan, String nickName, String teritory) {
        this.totalKasusTerselesaikan = totalKasusTerselesaikan;
        this.nickName = nickName;
        this.teritory = teritory;
    }
}

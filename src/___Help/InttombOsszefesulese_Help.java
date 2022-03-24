package ___Help;

import java.util.Arrays;

public class InttombOsszefesulese_Help {
    public static void main(String[] args) {
        int[] tomb1 = new int[] {1, 20, 5, 7, 9, 11, 13};
        int[] tomb2 = new int[] {2, 4, 6, 8, 9, 10, 13};

        int[] tombOsszefuttatas = new int[tomb1.length+tomb2.length];
        int i = 0;
        int j = 0;
        int szamlalo = -1;
        while(i < tomb1.length && j < tomb2.length) {
            szamlalo++;
            if(tomb1[i] < tomb2[j]) {
                tombOsszefuttatas[szamlalo] = tomb1[i++];
            }else if(tomb1[i] == tomb2[j]) {
                tombOsszefuttatas[szamlalo] = tomb1[i];
                i++;
                j++;
            }else if(tomb1[i] > tomb2[j]) {
                tombOsszefuttatas[szamlalo] = tomb2[j++];
            }
        }
        while(i < tomb1.length)
            tombOsszefuttatas[++szamlalo] = tomb1[i++];
        while(j < tomb2.length)
            tombOsszefuttatas[++szamlalo] = tomb2[j++];

        for(i = 0; i < szamlalo+1; i++){
            System.out.print(tombOsszefuttatas[i] + " ");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class Modifikasi {
    int [] dataBilangan = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyaknya data (n) : ");
        this.n = input.nextInt();
            for(int i=0; i<this.n; i++){
                System.out.print("Masukan bilangan ke - " + (i+1)+ " : ");
                this.dataBilangan[i] = input.nextInt();
            }
    }
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMinimal(int[] data){
        int minimal = data[0];
        for(int i = 0; i < this.n; i++) {
            if(data[i] < minimal) {
                minimal = data[i];
            }
        }
        return minimal;
    }
    int cariMaximal(int[] data){
        int maximal = data[0];
        for(int i=0; i < this.n; i++){
            if (data[i] > maximal){
                maximal = data[i];
            }
        }
        return maximal;
    }
    
    void urut(int[]data){
        int n = this.n;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        
        for (int i=0; i < n; i++){
            System.out.print(data[i] +" ");
        }
        
    }
    
    void output(){
        System.out.println("\n Berikut Hasil Perhitungannya: ");
        System.out.println("Nilai Rata-Ratanya  : " + hitungRerata(this.dataBilangan));
        System.out.println("Nilai minimumnya    : " + cariMinimal(this.dataBilangan));
        System.out.println("Milai maximumnya    : " + cariMaximal(this.dataBilangan));
        System.out.print("Urutan Nilainya sebagai berikut : ");

        urut(dataBilangan);
    }   
}
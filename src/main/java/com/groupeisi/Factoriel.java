package com.groupeisi;

public class Factoriel {
    public int factoriel(int n) {
        int f = 1;
        for(int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}

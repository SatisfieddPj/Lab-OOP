/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction() {
        return "" + topN + "/" + btmN;
    }
    public String toFloat() {
        double asFloat = (double) topN/btmN;
        return asFloat+ "";
    }
    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN = topN + f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public boolean myEquals(Fraction x) {
        return (double) topN/btmN == (double )x.topN/x.btmN;
    }
    public void LowestTermFrac() {
        int divisor = gcd(Math.abs(topN), Math.abs(btmN));
        topN /= divisor;
        btmN /= divisor;
    }
}

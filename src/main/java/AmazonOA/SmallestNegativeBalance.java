package AmazonOA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SmallestNegativeBalance {

    public static class DebtRecord {
        String borrower = "";
        String lender = "";
        int amount = 0;

        public DebtRecord() {
        }

        public DebtRecord(String borrower, String lender, int amount) {
            this.borrower = borrower;
            this.lender = lender;
            this.amount = amount;
        }
    }


    public void findSmallestNegativeBalance(int rows, int cols, List<DebtRecord> records) {
        SortedMap<String, Integer> balanceSheet = new TreeMap<>();
        for (DebtRecord debt : records) {
            if (balanceSheet.containsKey(debt.borrower)) {
                balanceSheet.put(debt.borrower, balanceSheet.get(debt.borrower).intValue() - debt.amount);
                balanceSheet.put(debt.lender, balanceSheet.get(debt.lender).intValue() + debt.amount);
            } else {
                balanceSheet.put(debt.borrower, -debt.amount);
                balanceSheet.put(debt.lender, debt.amount);
            }
        }

        List<String> lowestPeople = new ArrayList<>();
        int lowestBalance = -1;

        for (Map.Entry<String, Integer> name : balanceSheet.entrySet()) {
            if (name.getValue() < lowestBalance) {
                lowestPeople = new ArrayList<>();
                lowestPeople.add(name.getKey());
                lowestBalance = name.getValue();
            } else if (name.getValue() == lowestBalance){
                lowestPeople.add(name.getKey());
            }
        }

        System.out.println(lowestPeople);

    }


}

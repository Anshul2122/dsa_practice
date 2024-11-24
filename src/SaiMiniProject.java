//import java.util.*;
//
//public class SaiMiniProject {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int initialBalance = sc.nextInt();  // Initial balance
//        int n = sc.nextInt();              // Number of operations
//        int currentIndex = 0;              // Current committed state index
//        ArrayList<Integer> committedBalances = new ArrayList<>();  // Stores balance after each commit
//        ArrayList<Integer> currentTransactions = new ArrayList<>(); // Stores uncommitted transactions
//        committedBalances.add(initialBalance);
//        int currentBalance = initialBalance;
//        String read = "read";
//        String credit = "credit";
//        String debit = "debit";
//        String abort = "abort";
//        String rollback = "rollback";
//        String commit = "commit";
//
//        for (int i = 0; i < n; i++) {
//            String operation = sc.next();
//
//            if (operation.equals(read)) {
//                System.out.println(currentBalance);
//            } else if (operation.equals(credit)) {
//                int creditAmount = sc.nextInt();
//                currentBalance += creditAmount;
//                currentTransactions.add(creditAmount);
//            } else if(operation.equals(debit)){
//                int debitAmount = sc.nextInt();
//                // Check if debit would make balance negative
//                if (currentBalance >= debitAmount) {
//                    currentBalance -= debitAmount;
//                    currentTransactions.add(-debitAmount);
//                }
//            } else if (operation.equals(abort)) {
//                int abortIndex = sc.nextInt();
//                // Can only abort uncommitted transactions
//                if (abortIndex <= currentTransactions.size()) {
//                    // Reverse the transaction if it hasn't been zeroed out
//                    if (currentTransactions.get(abortIndex - 1) != 0) {
//                        currentBalance -= currentTransactions.get(abortIndex - 1);
//                        currentTransactions.set(abortIndex - 1, 0);
//                    }
//                }
//            } else if (operation.equals(rollback)) {
//
//            }
//            case "rollback":
//                    int rollbackIndex = sc.nextInt();
//                    if (rollbackIndex <= committedBalances.size()) {
//                        // Reset to the state after the specified commit
//                        currentIndex = rollbackIndex - 1;
//                        currentBalance = committedBalances.get(currentIndex);
//                        // Clear all uncommitted transactions
//                        currentTransactions.clear();
//                        // Remove any later committed states
//                        while (committedBalances.size() > rollbackIndex) {
//                            committedBalances.remove(committedBalances.size() - 1);
//                        }
//                    }
//                    break;
//                case "commit":
//                    // Save current state
//                    committedBalances.add(currentBalance);
//                    currentIndex++;
//                    // Clear transaction history as they're now committed
//                    currentTransactions.clear();
//                    break;
//            }
//        }
//
//        sc.close();
//    }
//}

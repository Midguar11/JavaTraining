package gyakorlasok;//package ___Help;
//
//public class BackTrackV1 {
//    public List<String> generateParenthesis(int n) {
//        List<String> res = new LinkedList<>();
//        backtrack(res, "", n, n);
//        return res;
//    }
//    private void backtrack(List<String> res, String parenthesis, int left, int right) {
//        if(left > right) {
//            return;
//        } else if(left == 0 && right == 0) {
//            res.add(parenthesis);
//        } else {
//            backtrack(res, parenthesis + ")", left, right-1);
//            if(left > 0) {
//                backtrack(res, parenthesis + "(", left-1, right);
//            }
//        }
//    }
//}

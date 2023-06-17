import java.io.*;
import java.util.*;
            public class MinimumSum_2possiblenumbers {
                public static void main(String[] args) throws Exception {
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    int tc = Integer.parseInt(br.readLine().trim());
                    while (tc-- > 0) {
                        String[] inputLine;
                        inputLine = br.readLine().trim().split(" ");
                        int n = Integer.parseInt(inputLine[0]);
                        int[] arr = new int[n];
                        inputLine = br.readLine().trim().split(" ");
                        for (int i = 0; i < n; i++) {
                            arr[i] = Integer.parseInt(inputLine[i]);
                        }

                        String ans = new Solution().solve(arr, n);
                        System.out.println(ans);
                    }
                }

                public static class Solution {
                    String solve(int[] arr, int n) {
                        Arrays.sort(arr);
                        List<Integer> list1 = new ArrayList<>();
                        List<Integer> list2 = new ArrayList<>();
                        StringBuilder sb = new StringBuilder();

                        int i = 0, j = 1;

                        while (i < n) {
                            list1.add(arr[i]);
                            i += 2;
                        }

                        while (j < n) {
                            list2.add(arr[j]);
                            j += 2;
                        }

                        int carry = 0;
                        int x = list1.size() - 1, y = list2.size() - 1;
                        while (x >= 0 && y >= 0) {
                            int sum = list1.get(x) + list2.get(y) + carry;
                            carry = sum / 10;
                            if (sum != 0) {
                                sb.append(sum % 10);
                            }
                            x--;
                            y--;
                        }

                        while (x >= 0) {
                            if (list1.get(x) + carry != 0) {
                                sb.append(list1.get(x) + carry);
                            }
                            carry = 0;
                            x--;
                        }

                        while (y >= 0) {
                            if (list2.get(y) + carry != 0) {
                                sb.append(list2.get(y) + carry);
                            }
                            carry = 0;
                            y--;
                        }

                        if (carry != 0) {
                            sb.append(carry);
                        }

                        String result = sb.reverse().toString();

                        //return list1.toString();
                        return result;
                    }
                }
            }

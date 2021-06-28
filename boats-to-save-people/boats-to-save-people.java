class Solution {
   public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int a = 0;
    int n = people.length;
    int b = n - 1;
    int count = 0;

    while (a <= b) {
      count=count+1;
      if (people[a] + people[b] <= limit)
        a=a+1;
      b=b-1;
    }

    return count;

  }
}

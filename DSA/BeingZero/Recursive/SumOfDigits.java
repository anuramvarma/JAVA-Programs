import java.util.*;
import java.io.*;

class BeingZero {
    public int solve(int n) {
        // complete the function
        if(n==0)
            return 0;
        return (n%10)+solve(n/10);
    }
}

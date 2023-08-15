
//import java.util.Scanner;
//import java.Stack;
// import java.util.String;
//import java.lang.String;
import java.util.*;

//import javax.swing.plaf.synth.SynthSplitPaneUI;

public class DsaAllTopic {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void PrintList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node AddFirst(Node head, int val) {
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
        return head;
    }

    public static Node AddLast(Node head, int num) {
        Node curr = new Node(num);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = curr;
        return head;
    }

    public static Node AddPos(Node head, int num, int pos) {
        Node curr = new Node(num);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node v = temp.next;
        temp.next = curr;
        curr.next = v;
        return head;
    }

    public static Node DeleteBeg(Node head) {
        return head.next;
    }

    public static Node DeleteEnd(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node DeletePos(Node head, int posDel) {
        Node temp = head;
        for (int i = 0; i < posDel - 1; i++) { // 1 2 3 4 5
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }

    public static int Length_List(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static Node ReverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr; // 1 2 345 8
            curr = temp;
        }
        return prev;
    }

    public static void Substring(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }

    public static String ReverseString(String str) {
        int len = str.length();
        String ans = "";
        for (int i = 0; i < len; i++) {
            ans = str.charAt(i) + ans;
        }
        return ans;
    }

    public static boolean FindCharacter(String s, Character ch) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            Character ch1 = s.charAt(i);
            if (ch1 == ch) {
                return true;
            }
        }
        return false;
    }

    public static int StringLen(String str) {
        return str.length();
    }

    public static void IterateString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static String Concatenat(String s1, String s2) {
        return s1 + s2;
    }

    public static int[] ReverseArray(int[] arr) {
        int size = arr.length - 1;
        int i = 0;
        while (i < size) {
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;
            i++;
            size--;
        }
        return arr;
    }

    public static void Display(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] UpdatingElements(int[] arr, int UpdateInd, int newValue) {
        int num = arr.length;
        for (int z = 0; z < num; z++) {
            if (z == UpdateInd) {
                arr[z] = newValue;
                break;
            }
        }
        return arr;
    }

    public static int BinarySearchElement(int[] arr, int value) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int SearchElement(int[] srr, int value) {
        for (int i = 0; i < srr.length; i++) {
            if (srr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void TraverseArray() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter array size->>  ");
        int size = sc1.nextInt();
        int[] ar = new int[size];
        System.out.println("Enter " + size + " all elements in array ->>");
        for (int i = 0; i < size; i++) {
            ar[i] = sc1.nextInt();
        }
        System.out.println("Print array elements ->>");
        for (int j = 0; j < size; j++) {
            System.out.print(ar[j] + " ");
        }
    }

    public static void AddStack(Stack<Integer> st) {
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);

        System.out.println("Enter Stack size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            st.add(val);
        }
        System.out.print(st + " ");
        System.out.println();
    }

    public static void PrintStack(Stack<Integer> st) {
        System.out.println("Stack Elements -->> ");
        System.out.print(st + " ");
        System.out.println();
    }

    public static class NodeQ {
        int data;
        NodeQ next;

        NodeQ(int data) {
            this.data = data;
        }
    }

    public static class QueueLL {
        NodeQ head = null;
        NodeQ tail = null;
        int size = 0;

        public void add(int x) {
            NodeQ temp = new NodeQ(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int poll() {
            if (size == 0) {
                System.out.println("Queue is Empty ");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;

        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty ");
                return -1;
            }
            return head.data;
        }

        public void Display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            } else {
                NodeQ temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
            System.out.println();
        }
    }

    public static class QueueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];

        public void add(int x) {
            if (r == arr.length - 1) {
                System.out.println("array is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = x;
            } else {
                arr[++r] = x;
            }
            size++;
        }

        public int poll() {
            if (size < 0) {
                System.out.println("Queue is Empty ");
                return -1;
            }
            int n = arr[f];
            f++;
            size--;
            return n;
        }

        public int peek() {
            if (size < 0) {
                System.out.println("Queue is Empty ");
                return -1;
            }
            return arr[f];
        }

        public void Display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Test Case -> ");
        int Test_Case = sc.nextInt();

        for (int k = 1; k <= Test_Case; k++) {
            System.out.print("Enter your Choice ---> ");
            System.out.println();
            System.out.println("              ____________________________");
            System.out.println("             |  * Enter -> 1 -> Array      |");
            System.out.println("             |  * Enter -> 2 -> String     |");
            System.out.println("             |  * Enter -> 3 -> LinkedList |");
            System.out.println("             |  * Enter -> 4 -> Stack      |");
            System.out.println("             |  * Enter -> 5 -> Queue      |");
            System.out.println("             |  * Enter -> 6 -> HashMap    |");
            System.out.println("             |  * Enter -> 7 -> HashSet    |");
            System.out.println("              _____________________________");

            System.out.print("USER->>  ");
            int Choice = sc.nextInt();

            if (Choice == 1) {
                System.out.println("  -----------------------");
                System.out.println(" | WELCOME TO ARRAY ---> |");
                System.out.println("  -----------------------");

                System.out.print("Enter your choice->>   ");

                System.out.println();
                System.out
                        .println("         _________________________________________________________________________");
                System.out.println(
                        "        |   *Enter -> 1 -> Traverse  -> print all the array elements one by one.   |");
                System.out.println(
                        "        |   *Enter -> 2 -> Insertion -> Adds an element at the given index.        |");
                System.out.println(
                        "        |   *Enter -> 3 -> Deletion  ->Deletes an element at the given index.      |");
                System.out.println(
                        "        |   *Enter -> 4 -> Search    ->Searches an element using the given index   |");
                System.out.println(
                        "        |   *Enter -> 5 -> Update    ->Updates an element at the given index.      |");
                System.out.println(
                        "        |   *Enter -> 6 -> Display   ->Displays the contents of the array.         |");
                System.out.println(
                        "        |   *Enter -> 7 -> Reverse   ->Reverse arrays all Elements.                     |");

                System.out
                        .println("         _________________________________________________________________________");
                System.out.print("USER->>  ");
                int Operation = sc.nextInt();

                if (Operation == 1) {
                    TraverseArray();

                } else if (Operation == 2) {
                    int len, p, e;
                    System.out.print("Enter length of an array:->  ");
                    len = sc.nextInt();
                    int arr[] = new int[len + 1];
                    System.out.println("Enter " + len + " all the elements:->  ");
                    for (int i = 0; i < len; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.print("Enter the position where you want to insert an element:->  ");
                    p = sc.nextInt();
                    System.out.print("Enter the element which you want to insert:->   ");
                    e = sc.nextInt();
                    for (int i = len - 1; i >= (p - 1); i--) {
                        arr[i + 1] = arr[i];
                    }
                    arr[p - 1] = e;
                    System.out.print("After inserting :->   ");
                    for (int i = 0; i <= len; i++) {
                        System.out.print(arr[i] + ",");
                    }

                } else if (Operation == 3) {
                    int len, p;
                    System.out.print("Enter length of an array:->  ");
                    len = sc.nextInt();
                    int arr[] = new int[len];
                    int i = 0;
                    System.out.println("Enter " + len + " all the elements:->  ");
                    for (i = 0; i < len; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.print("Enter the Index to be delete:->  ");
                    p = sc.nextInt();
                    for (int j = p; j < len - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    len--;
                    System.out.print("After deletion:->  ");
                    for (i = 0; i < len; i++) {
                        System.out.print(arr[i] + ",");
                    }

                } else if (Operation == 4) {
                    System.out.println("Enter your Choice -> ");

                    System.out.println("              ________________________________");
                    System.out.println("             |  * Enter -> 1 -> Leaner Search |");
                    System.out.println("             |  * Enter -> 2 -> Binary Search |");
                    System.out.println("              _______________________________");
                    System.out.print("USER->>  ");
                    int num = sc.nextInt();

                    if (num == 1) {
                        int n;
                        System.out.print("Enter length of an array:->  ");
                        n = sc.nextInt();
                        int srr[] = new int[n];
                        int i = 0;
                        System.out.println("Enter " + n + " all the elements:->  ");
                        for (i = 0; i < n; i++) {
                            srr[i] = sc.nextInt();
                        }
                        System.out.print("Enter a Element to be Searched:->  ");
                        int value = sc.nextInt();
                        int ind = SearchElement(srr, value);
                        System.out.println("INDEX -> " + ind);

                    } else {
                        System.out.print("Enter length of an array:->  ");
                        int n = sc.nextInt();
                        int arr[] = new int[n];
                        System.out.println("Enter " + n + " all the elements:->  ");
                        for (int i = 0; i < n; i++) {
                            arr[i] = sc.nextInt();
                        }
                        System.out.print("Enter a Element to be Searched:->  ");
                        int value = sc.nextInt();
                        int ind = BinarySearchElement(arr, value);
                        System.out.println("INDEX -> " + ind);
                    }

                } else if (Operation == 5) {
                    int len;
                    System.out.print("Enter length of an array:->  ");
                    len = sc.nextInt();
                    int arr[] = new int[len + 1];
                    System.out.println("Enter " + len + " all the elements:->  ");
                    for (int i = 0; i < len; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.print("Enter the position to be Update:->  ");
                    int UpdateInd = sc.nextInt();
                    System.out.print("Enter New Value :->   ");
                    int newValue = sc.nextInt();
                    int[] Final = UpdatingElements(arr, UpdateInd, newValue);
                    System.out.print("After Updating :->   ");
                    for (int i = 0; i < len; i++) {
                        System.out.print(Final[i] + ",");
                    }

                } else if (Operation == 6) {
                    int[] a = { 10, 20, 30, 40, 50 };
                    Display(a);

                } else if (Operation == 7) {
                    int len;
                    System.out.print("Enter length of an array:->  ");
                    len = sc.nextInt();
                    int arr[] = new int[len];
                    System.out.println("Enter " + len + " all the elements:->  ");
                    for (int i = 0; i < len; i++) {
                        arr[i] = sc.nextInt();
                    }
                    int[] ans = ReverseArray(arr);
                    for (int i = 0; i < len; i++) {
                        System.out.print(ans[i] + ",");
                    }
                    System.out.println();

                } else {
                    System.out.println("SORRY*** ->> INVALID CHOICE ");
                }
            }

            else if (Choice == 2) {
                System.out.println("  -----------------------");
                System.out.println(" | WELCOME TO STRING ---> |");
                System.out.println("  -----------------------");

                System.out.print("Enter your choice->>   ");

                System.out.println();
                System.out
                        .println("        ______________________________________________________________________");
                System.out.println(
                        "        |   * Enter -> 1 -> Concatenat  -> Concatenating Two strings          |");
                System.out.println(
                        "        |   * Enter -> 2 -> Iterate   -> Iterate over characters of a string .|");
                System.out.println(
                        "        |   * Enter -> 3 -> Length  -> Java String length() Method.           |");
                System.out.println(
                        "        |   * Enter -> 4 -> Search    ->Search an  Character                  |");
                System.out.println(
                        "        |   * Enter -> 5 -> Update    ->Updates an Character.                 |");
                System.out.println(
                        "        |   * Enter -> 6 -> Reverse    ->Reverse String.                      |");
                System.out.println(
                        "        |   * Enter -> 7 -> Substring    ->String | Subsequence & Substring.                 |");
                System.out
                        .println("         _____________________________________________________________________");
                System.out.print("USER->>  ");
                int Operation = sc.nextInt();

                if (Operation == 1) {
                    String s1 = "Gaurav ";
                    System.out.println("String s1 -->  " + s1);
                    String s2 = "Negi";
                    System.out.println("String s2 -->  " + s2);
                    String result = Concatenat(s1, s2);
                    // String result = s1 + s2;
                    System.out.println("concatenat --> " + result);
                    System.out.println();

                } else if (Operation == 2) {
                    String str = "GauravNegi";
                    int n = str.length();
                    IterateString(str, n);
                    System.out.println();

                } else if (Operation == 3) {
                    String str = "MyNameIsJava";
                    int n = StringLen(str);
                    System.out.println("length " + n);
                    System.out.println();

                } else if (Operation == 4) {
                    String s = "DAVIET";
                    System.out.println("String --> " + s);
                    System.out.println("Enter character to be find ");
                    Character ch = sc.next().charAt(0);
                    if (FindCharacter(s, ch)) {
                        System.out.println("true -> Character is present in string ");
                    } else {
                        System.out.println("False -> Character is not present in String");
                    }
                    System.out.println();

                } else if (Operation == 5) {

                    String str = "JALANDHAR";
                    System.out.println("Original String = " + str);
                    System.out.print("Enter Index ->>  ");
                    int index = sc.nextInt();
                    System.out.print("Enter new Character -- >>  ");
                    Character ch = sc.next().charAt(0);
                    StringBuilder string = new StringBuilder(str);
                    string.setCharAt(index, ch);
                    System.out.println("Modified String = " + string);
                    System.out.println();

                } else if (Operation == 6) {
                    String str = "gaurav";
                    System.out.println("Original String " + str);
                    String ans = ReverseString(str);
                    System.out.println(" Reverse String " + ans);
                    System.out.println();
                }

                else if (Operation == 7) {
                    String str = "DAVIET";
                    System.out.println("Original String -->> " + str);
                    Substring(str);
                } else {
                    System.out.println("SORRY ! -->> INVALID CASE ");
                }

            } else if (Choice == 3) {
                System.out.println(" | ----------------------------|");
                System.out.println(" | WELCOME TO LinkedList ---> |");
                System.out.println(" | ----------------------------|");

                System.out.print("Enter your choice->>   ");

                System.out.println();
                System.out
                        .println("        ______________________________________________________________________");
                System.out.println(
                        "        |   * Enter -> 1 -> Adding_head     ->   Insert In Starting                  |");
                System.out.println(
                        "        |   * Enter -> 2 -> Adding_tail     ->   Insert In End .                     |");
                System.out.println(
                        "        |   * Enter -> 3 -> Length          ->   Insert at a particular position.    |");
                System.out.println(
                        "        |   * Enter -> 4 -> Delete_Beginning ->  delete Beginning                    |");
                System.out.println(
                        "        |   * Enter -> 5 -> Delete_Ending     -> delete Ending .                     |");
                System.out.println(
                        "        |   * Enter -> 6 -> Delete_position   -> delete  at a Particular Position .  |                    |");
                System.out.println(
                        "        |   * Enter -> 7 -> Length_List       -> Length of List .                    |");
                System.out.println(
                        "        |   * Enter -> 8 -> Reverse           -> Reverse List                        |");
                System.out.println(
                        "        |   * Enter -> 9 -> Exit              ->  Exit   .                           |");
                System.out
                        .println("         _____________________________________________________________________");
                System.out.print("USER->>  ");
                int O = sc.nextInt();
                Node a = new Node(1);
                Node b = new Node(2);
                Node c = new Node(3);
                Node d = new Node(4);
                Node e = new Node(5);
                a.next = b;
                b.next = c;
                c.next = d;
                d.next = e;
                // PrintList(a);
                switch (O) {
                    case 1:
                        PrintList(a);
                        System.out.println("Enter new Number to  be add -->  ");
                        int val = sc.nextInt();
                        Node ans = AddFirst(a, val);
                        PrintList(ans);
                        System.out.println();
                        break;
                    case 2:
                        PrintList(a);
                        System.out.println("Enter new Number to be add in End ->> ");
                        int num = sc.nextInt();
                        Node ansEnd = AddLast(a, num);
                        PrintList(ansEnd);
                        System.out.println();
                        break;
                    case 3:
                        PrintList(a);
                        System.out.println("Enter new Number to be add in given position ->> ");
                        int num1 = sc.nextInt();
                        System.out.println("Enter position ->> ");
                        int pos = sc.nextInt();
                        Node anspos = AddPos(a, num1, pos);
                        PrintList(anspos);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Original List -->> ");
                        PrintList(a);
                        System.out.println("Delete elementa -->> beginning -->> ");
                        Node ansDelBeg = DeleteBeg(a);
                        PrintList(ansDelBeg);
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Original List -->> ");
                        PrintList(a);
                        System.out.println("Delete elementa -->> Ending -->>  ");
                        Node ansDelEnd = DeleteEnd(a);
                        PrintList(ansDelEnd);
                        System.out.println();
                        break;
                    case 6:
                        PrintList(a);
                        System.out.println("Enter position -->> ");
                        int posDel = sc.nextInt();
                        System.out.println("Delete elementa -->> Given Position -->>  ");
                        Node ansDelPos = DeletePos(a, posDel);
                        PrintList(ansDelPos);
                        System.out.println();
                        break;
                    case 7:
                        PrintList(a);
                        int Len = Length_List(a);
                        System.out.println("Length of List -- >> " + Len);
                        System.out.println();
                        break;
                    case 8:
                        System.out.println("Original List --> ");
                        PrintList(a);
                        Node reverselist = ReverseList(a);
                        System.out.println("Reverse List -- > ");
                        PrintList(reverselist);
                        break;

                    case 9:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n Wrong Choice!");
                        System.out.println();
                        break;
                }
            } else if (Choice == 4) {
                System.out.println("  -----------------------");
                System.out.println(" | WELCOME TO Stack ---> |");
                System.out.println("  -----------------------");

                System.out.print("Enter your choice->>   ");

                System.out.println();
                System.out
                        .println("         _________________________________________________________________________");
                System.out.println(
                        "        |   *Enter -> 1 -> Traverse      ->   print all the Stack elements one by one.|");
                System.out.println(
                        "        |   *Enter -> 2 -> Push_Elements ->   Adds an element in Stack.               |");
                System.out.println(
                        "        |   *Enter -> 3 -> Pop_Elements  ->   Deletes  element in Stack.              |");
                System.out.println(
                        "        |   *Enter -> 4 -> peek_Elements ->   First Elements of Stack                 |");
                System.out.println(
                        "        |   *Enter -> 5 -> Reverse_stack ->    Reverse of Stack                       |");
                System.out.println(
                        "        |   *Enter -> 6 -> Exit          ->     Exit                                  |");
                System.out.println(
                        "        |   *Enter -> 7 -> Reverse       ->     Reverse arrays all Elements.          |");
                System.out
                        .println("         _________________________________________________________________________");
                System.out.print("USER->>  ");
                int Op = sc.nextInt();
                Stack<Integer> st = new Stack<>();
                // AddStack(st);
                switch (Op) {
                    case 1:
                        Stack<Integer> ans = new Stack<>();
                        System.out.println("Stack Elements -->>   ");
                        AddStack(ans);
                        System.out.println();
                        break;
                    case 2:
                        AddStack(st);
                        System.out.println("Enter value to be insert ");
                        int v = sc.nextInt();
                        st.push(v);
                        System.out.println("New Stack -->   ");
                        PrintStack(st);
                        System.out.println();
                        break;
                    case 3:
                        Stack<Integer> rt = new Stack<>();
                        AddStack(rt);
                        System.out.println("Remove first elementa ---> ");
                        rt.pop();
                        PrintStack(rt);
                        System.out.println();
                        break;
                    case 4:
                        Stack<Integer> gt = new Stack<>();
                        AddStack(gt);
                        int num = gt.peek();
                        System.out.println("First elements in stack-->  ");
                        System.out.println("-->>  " + num);
                        System.out.println();
                        break;
                    case 5:
                        Stack<Integer> qt = new Stack<>();
                        AddStack(qt);
                        Stack<Integer> rev = new Stack<>();
                        while (qt.size() > 0) {
                            rev.push(qt.pop());
                        }
                        PrintStack(rev);
                        System.out.println();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\n Wrong Choice!");
                        System.out.println();
                        break;
                }
            } else if (Choice == 5) {
                System.out.println("  -----------------------");
                System.out.println(" | WELCOME TO QUEUES ---> |");
                System.out.println("  -----------------------");

                System.out.print("Enter your choice->>   ");
                System.out.println();
                System.out
                        .println("   ________________________________________________________");
                System.out.println(
                        "        |   *Enter -> 1 -> LinkedList  ->  Queue- using LinkedList.|");
                System.out.println(
                        "        |   *Enter -> 2 -> Array       ->   Queue- using Array     |");
                System.out.println(
                        "        |   *Enter -> 3 -> Exit        ->   Exit                   |");
                System.out
                        .println("   ________________________________________________________");

                System.out.println("USER->>  ");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        QueueLL qt = new QueueLL();
                        qt.Display(); // queue is empty
                        qt.add(1);
                        qt.add(2);
                        qt.add(3);
                        qt.add(4);
                        qt.Display();// 1 2 3 4
                        qt.poll();
                        qt.Display();// 2 3 4
                        System.out.println(qt.peek());// 2
                        break;
                    case 2:
                        QueueA qt1 = new QueueA();
                        qt1.Display();
                        qt1.add(1);
                        qt1.add(2);
                        qt1.add(3);
                        qt1.add(4);
                        qt1.Display();
                        qt1.poll();
                        qt1.Display();
                        System.out.println(qt1.peek());
                        break;
                    case 3:
                        System.out.println("exit --> ");
                        break;
                    default:
                        System.out.println("invalid choice -->>  ");
                        break;
                }

            } else if (Choice == 6) {
                System.out.println("  -----------------------");
                System.out.println(" | WELCOME TO HASHMAP ---> |");
                System.out.println("  -----------------------");

                System.out.print("Enter your choice->>   ");
                System.out.println();
                System.out
                        .println("         _____________________________________________________________");
                System.out.println(
                        "        |   *Enter -> 1 -> print value and key  ->  Print Map value and key .   |");
                System.out.println(
                        "        |   *Enter -> 2 -> put_key_value        ->   put value and key on map   |");
                System.out.println(
                        "        |   *Enter -> 3 -> size_map             ->   size of map                |");
                System.out.println(
                        "        |   *Enter -> 4 -> containsKey_function ->   check key is present in map|");
                System.out.println(
                        "        |   *Enter -> 5 -> Exit                 ->   Exit                       |");
                System.out
                        .println("         ______________________________________________________________");

                System.out.println("USER->>  ");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        HashMap<String, Integer> map = new HashMap<>();
                        map.put("gaurav", 10);
                        map.put("Negi", 20);
                        map.put("BCA", 30);
                        map.put("DAVIET", 40);
                        System.out.print(map);
                        System.out.println();
                        break;
                    case 2:
                        HashMap<Character, Integer> map1 = new HashMap<>();
                        System.out.print("Enter value to be insert-->>  ");
                        int val1 = sc.nextInt();
                        System.out.print("Enter key to be insert -->> ");
                        Character str = sc.next().charAt(0);
                        map1.put(str, val1);
                        System.out.println(map1);
                        System.out.println();
                        break;
                    case 3:
                        HashMap<String, Integer> map2 = new HashMap<>();
                        map2.put("gaurav", 10);
                        map2.put("Negi", 20);
                        map2.put("BCA", 30);
                        map2.put("DAVIET", 40);
                        int size = map2.size();
                        System.out.print(map2);
                        System.out.println();
                        System.out.print("size of map -->>  " + size);
                        System.out.println();
                        break;
                    case 4:
                        HashMap<Character, Integer> map3 = new HashMap<>();
                        map3.put('a', 10);
                        map3.put('b', 20);
                        map3.put('c', 30);
                        map3.put('d', 40);
                        System.out.println(map3);
                        System.out.println();
                        System.out.print("Enter key to be checked --> ");
                        Character st = sc.next().charAt(0);
                        if (map3.containsKey(st)) {
                            System.out.println("true--->> key is present in map ");
                        } else {
                            System.out.println("false--->> key is not present in map ");
                        }
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Exit(0 ");
                        break;
                    default:
                        System.out.println("Sorry -->  Invalid ");
                }

            } else if (Choice == 7) {
                System.out.println("  -----------------------");
                System.out.println(" | WELCOME TO HASHSET ---> |");
                System.out.println("  -----------------------");

                System.out.print("Enter your choice->>   ");
                System.out.println();
                System.out
                        .println("         ____________________________________________________________________");
                System.out.println(
                        "        |   *Enter -> 1 -> print value      ->  Print set value  .             |");
                System.out.println(
                        "        |   *Enter -> 2 -> add_value        ->   add value on set              |");
                System.out.println(
                        "        |   *Enter -> 3 -> size_set         ->   size of set                   |");
                System.out.println(
                        "        |   *Enter -> 4 -> contains_function ->   check value is present in set|");
                System.out.println(
                        "        |   *Enter -> 5 -> Exit              ->   Exit                         |");
                System.out
                        .println("         ______________________________________________________________________");

                System.out.println("USER->>  ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        HashSet<Integer> set = new HashSet<>();
                        set.add(1);
                        set.add(2);
                        set.add(3);
                        set.add(4);
                        set.add(5);
                        System.out.print(set);
                        System.out.println();
                        break;
                    case 2:
                        HashSet<Integer> set1 = new HashSet<>();
                        System.out.print("Enter value to be insert-->>  ");
                        int val1 = sc.nextInt();
                        set1.add(val1);
                        System.out.println(set1);
                        System.out.println();
                        break;
                    case 3:
                        HashSet<Integer> set2 = new HashSet<>();
                        set2.add(10);
                        set2.add(20);
                        set2.add(30);
                        int size = set2.size();
                        System.out.print(set2);
                        System.out.println();
                        System.out.print("size of set -->>  " + size);
                        System.out.println();
                        break;
                    case 4:
                        HashSet<Integer> set3 = new HashSet<>();
                        set3.add(10);
                        set3.add(20);
                        set3.add(30);
                        set3.add(40);
                        System.out.println(set3);
                        System.out.println();
                        System.out.print("Enter value to be checked --> ");
                        int st = sc.nextInt();
                        if (set3.contains(st)) {
                            System.out.println("true--->> key is present in map ");
                        } else {
                            System.out.println("false--->> key is not present in map ");
                        }
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Exit(0 ");
                        break;
                    default:
                        System.out.println("Sorry -->  Invalid ");
                }

            } else {
                System.out.println("  -----------------------");
                System.out.println(" | SORRY  ---> YOUR CHOICE IS INVALID* |");
                System.out.println("  -----------------------");

            }
        }

    }
}
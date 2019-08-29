package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class CherriesMesh {
    int totalWeight;
    Set<Edge> graph;

    static class Node {
        Node parent;
        int value;

        public Node() {
            this.value = 0;
            this.parent = null;
        }

        public Node(int value) {
            this.value = value;
            this.parent = null;
        }

        @Override
        public boolean equals(Object object) {
            Node obj = (Node) object;

            System.out.println("a:"+this.value+"|b:"+ obj.value);
            if(this.value == obj.value)
                return true;
            return false;
        }

        @Override
        public int hashCode() {return 0;}

    }

    static class Edge {
        Node s;
        Node t;
        int weight;

        public Edge() {
            this.s = null;
            this.t = null;
            this.weight = 0;
        }

        public Edge(Node s, Node t, int weight) {
            this.s = s;
            this.t = t;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object object) {
            Edge obj = (Edge) object;

            System.out.println("a:"+this.weight+"|b:"+ obj.weight);
            if(this.s.value == obj.t.value || this.t.value == obj.s.value)
                return true;
            return false;
        }

        @Override
        public int hashCode() {return 0;}
    }

    public static void union(Node a, Node b) {
        Node x = find(a);
        Node y = find(b);
        x.parent = a;
        y.parent = a;
    }

    public static Node find(Node a) {
        Node temp = a;
        while (temp.parent != null) {
            temp = temp.parent;
        }
        Node child = a;

        while (!child.equals(temp)) { // Equals implement
            Node nextChild = child.parent;
            child.parent = temp;
            child = nextChild;
        }
        return temp;
    }

    public static int constructMinTree(Edge[] graph) {
        List<Edge> mst = new ArrayList<>();
        int resWeight = 0;
        for (Edge e : graph) {
            if (!find(e.s).equals(find(e.t))) {
                mst.add(e);
                resWeight += e.weight;
                union(e.s, e.t);
            }
        }
        return resWeight;
    }

    public static int findTotalWeight(List<Edge> minTree) {
        int weight = 0;
        for (Edge e : minTree) {
            weight += e.weight;
        }
        return weight;
    }


    public static Edge[] generateCherryGraph(Edge[] cherryGraph, int N, Integer[][] edgeMatrix) {
        int edgeCounter = 0;
        Edge e = new Edge();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                if (null != edgeMatrix[i][j]) {
                    Node s = new Node(i);
                    Node t = new Node(j);
                    if (edgeMatrix[i][j].equals(1)) {
                        continue;
                    } else {
                        e = new Edge(s, t, 2);
                    }
                    cherryGraph[edgeCounter++] = e;
                }
            }
        }
        return cherryGraph;
    }
//    2
//    2 1
//    1 2
//    3 1
//    2 3

    public static void main(String args[]) {
        Integer edgeMatrix[][];
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int edgeCounter = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            Edge[] cherryGraph = new Edge[(N * (N - 1)) / 2];
            edgeMatrix = new Integer[N][N];
            for (int i = 0; i < M; i++) {
                int ci = sc.nextInt();
                int di = sc.nextInt();
                edgeMatrix[ci-1][di-1] = 1;
                cherryGraph[edgeCounter++] = new Edge(new Node(ci), new Node(di), 1);
            }
            cherryGraph = generateCherryGraph(cherryGraph, N, edgeMatrix);
            int ans = constructMinTree(cherryGraph);
            System.out.println(ans);
            T--;
        }
    }
}
package src.tests;


import java.util.*;

public class CritConn {
    private int id;
    private int[] ids;
    private int[] low;
    private List<Integer>[] graph;

    static class sortEdges implements Comparator<PairInt> {
        @Override
        public int compare(PairInt edge1, PairInt edge2) {
            int u1 = edge1.first;
            int u2 = edge2.first;
            int v1 = edge1.second;
            int v2 = edge2.second;
            if (u1 < u2)
                return -1;
            else {
                if (u1 == u2) {
                    if (v1 < v2)
                        return -1;
                    else if (v1 == v2)
                        return 0;
                    else
                        return 1;
                }
                else
                    return 1;
            }
        }
    }

    public List<PairInt> findBridges(int n, List<PairInt> roads) {
        List<PairInt> bridges = new ArrayList<>();
        graph = buildGraph(n, roads);
        ids = new int[n + 1];
        low = new int[n + 1];
        id = 1;
        visit(1, -1, bridges);
        Collections.sort(bridges,new sortEdges());
        return bridges;
    }

    private void visit(int at, int parent, List<PairInt> bridges) {
        low[at] = ids[at] = id++;
        for (int to : graph[at]) {
            if (to == parent) continue;
            if (ids[to] == 0) { // not visited
                visit(to, at, bridges);
                low[at] = Math.min(low[at], low[to]);
                if (ids[at] < low[to]) {
                    bridges.add(new PairInt(at, to));
                }
            } else {
                low[at] = Math.min(low[at], ids[to]);
            }
        }
    }

    private List<Integer>[] buildGraph(int n, List<PairInt> roads) {
        List<Integer>[] graph = new List[n + 1];
        Arrays.setAll(graph, (i) -> new ArrayList<>());
        for (PairInt road : roads) {
            int u = road.first;
            int v = road.second;
            graph[u].add(v);
            graph[v].add(u);
        }
        return graph;
    }

    public static void main(String[] args) {
        CritConn cc = new CritConn();
        List<PairInt> inp = new ArrayList<>();
        inp.add(new PairInt(1, 2));
//        inp.add(new PairInt(1, 3));
        inp.add(new PairInt(2, 3));
        inp.add(new PairInt(3, 4));
//        inp.add(new PairInt(3, 6));
        inp.add(new PairInt(4, 5));
        inp.add(new PairInt(5, 6));
        inp.add(new PairInt(6, 7));
//        inp.add(new PairInt(6, 9));
        inp.add(new PairInt(7, 8));
        inp.add(new PairInt(8, 9));
        List<PairInt> res = cc.findBridges(9, inp);
        for (PairInt r : res) {
            System.out.println(r.first + "," + r.second);
        }
    }
}
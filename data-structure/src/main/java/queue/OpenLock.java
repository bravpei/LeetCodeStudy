package queue;

import java.util.*;
import java.util.stream.Collectors;

public class OpenLock {
    public int solution(String[] deadends, String target){
        Set<String> deadSet=new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue=new LinkedList<>();
        int count=0;
        String startStr = "0000";
        if(deadSet.contains(startStr)){
            return -1;
        }
        queue.offer(startStr);
        deadSet.add(startStr);
        while(!queue.isEmpty()){
            int length= queue.size();
            while(length-->0){
                String src=queue.poll();
                if(Objects.equals(src,target)){
                    return count;
                }
                for(int j = 0; j< 4; j++){
                    char ch=src.charAt(j);
                    String add=src.substring(0, j) + (ch == '9' ? 0 : ch - '0' + 1) + src.substring(j + 1);
                    if(!deadSet.contains(add)){
                        queue.offer(add);
                        deadSet.add(add);
                    }
                    if(Objects.equals(add,target)){
                        return ++count;
                    }
                    String sub=src.substring(0, j) + (ch == '0' ? 9 : ch - '0' - 1) + src.substring(j + 1);
                    if(!deadSet.contains(sub)){
                        queue.offer(sub);
                        deadSet.add(sub);
                    }
                    if(Objects.equals(sub,target)){
                        return ++count;
                    }
                }
            }
            count++;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(new OpenLock().solution(null,"8888"));
    }
}

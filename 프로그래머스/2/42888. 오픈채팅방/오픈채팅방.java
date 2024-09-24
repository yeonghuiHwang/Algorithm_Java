import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        // 유저 ID와 닉네임을 관리하는 HashMap
        HashMap<String, String> userDB = new HashMap<>();
        
        // 행동 기록을 저장할 리스트
        List<String> messageList = new ArrayList<>();
        List<String> userIds = new ArrayList<>();  // 메시지에 대응하는 유저 ID 저장

        // 기록을 순차적으로 처리
        for (String log : record) {
            String[] parts = log.split(" ");
            
            String action = parts[0];  // 행동: Enter, Leave, Change
            String userId = parts[1];   // 사용자 ID
            
            // 사용자가 입장한 경우
            if (action.equals("Enter")) {
                String userName = parts[2];  // 닉네임
                userDB.put(userId, userName);  // ID에 대한 닉네임을 업데이트
                messageList.add("님이 들어왔습니다.");
                userIds.add(userId);
            } 
            // 사용자가 퇴장한 경우
            else if (action.equals("Leave")) {
                messageList.add("님이 나갔습니다.");
                userIds.add(userId);
            }
            // 닉네임을 변경한 경우
            else {
                String userName = parts[2];
                userDB.put(userId, userName);  // ID에 대한 닉네임을 업데이트
            }
        }
        
        // 최종 메시지를 생성
        String[] result = new String[messageList.size()];
        for (int i = 0; i < messageList.size(); i++) {
            String userId = userIds.get(i);  // 메시지에 대응하는 유저 ID를 가져옴
            String userName = userDB.get(userId);  // 최종 닉네임을 가져옴
            
            result[i] = userName + messageList.get(i);  // 최종 메시지 생성
        }
        return result;
    }
}

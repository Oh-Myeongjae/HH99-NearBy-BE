package com.hh99.nearby.chat.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ChatRoom {

    private Long roomId; //룸 아이디
    private String roomName; //룸 이름


    public static ChatRoom create(String name) {
        ChatRoom room = new ChatRoom();
        room.roomId = 1L; //테스트용
        room.roomName = name;
        return room;
    }
}

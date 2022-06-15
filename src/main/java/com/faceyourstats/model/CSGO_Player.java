package com.faceyourstats.model;

public class CSGO_Player {

    private String nickname;
    private String avatar;
    private String game_player_id;
    private int skill_level;
    private int faceit_elo;
    private String game_player_name;
    private String region;


    public CSGO_Player() {
       this.nickname = "";
       this.avatar = "";
       this.game_player_id = "";
       this.skill_level = 0;
       this.faceit_elo = 0;
       this.game_player_name = "";
       this.region = "";

    }

    public CSGO_Player(String nickname, String game_player_id, int skill_level, int faceit_elo, String game_player_name, String region, String avatar) {
        this.nickname = nickname;
        this.avatar = avatar;
        this.game_player_id = game_player_id;
        this.skill_level = skill_level;
        this.faceit_elo = faceit_elo;
        this.game_player_name = game_player_name;
        this.region = region;

    }





    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGame_player_id() {
        return game_player_id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setGame_player_id(String game_player_id) {
        this.game_player_id = game_player_id;
    }

    public int getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(int skill_level) {
        this.skill_level = skill_level;
    }

    public int getFaceit_elo() {
        return faceit_elo;
    }

    public void setFaceit_elo(int faceit_elo) {
        this.faceit_elo = faceit_elo;
    }

    public String getGame_player_name() {
        return game_player_name;
    }

    public void setGame_player_name(String game_player_name) {
        this.game_player_name = game_player_name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

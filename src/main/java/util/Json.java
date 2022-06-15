package util;

import com.faceyourstats.model.CSGO_Player;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper() {
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return defaultObjectMapper;

    }

    public static JsonNode parse(String src) {
        try {
            return objectMapper.readTree(src);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static CSGO_Player mapPlayer(JsonNode node)  {

        String nickname = node.get("nickname").asText();
        String avatar = node.get("avatar").asText();
        String game_player_id = node.get("games").get("csgo").get("game_player_id").asText();
        int skill_level = node.get("games").get("csgo").get("skill_level").asInt();
        int faceit_elo = node.get("games").get("csgo").get("faceit_elo").asInt();
        String game_player_name = node.get("games").get("csgo").get("game_player_name").asText();
        String region = node.get("games").get("csgo").get("region").asText();

        return  new CSGO_Player(nickname,game_player_id,skill_level,faceit_elo,game_player_name,region,avatar);
    }
}
package jsonTests;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.junit.Assert;
import org.junit.Test;
import util.Json;

public class JsonTester {

    private String source = "{\"player_id\":\"6604a99e-198a-482c-80da-9360beb1120e\",\"nickname\":\"AddaV\",\"avatar\":\"https://assets.faceit-cdn.net/avatars/6604a99e-198a-482c-80da-9360beb1120e_1550546474860.jpg\",\"country\":\"pl\",\"cover_image\":\"https://assets.faceit-cdn.net/users_covers/6604a99e-198a-482c-80da-9360beb1120e_1550762238070.jpg\",\"platforms\":{\"steam\":\"STEAM_1:0:77319788\"},\"games\":{\"csco\":{\"region\":\"EU\",\"game_player_id\":\"76561198114905304\",\"skill_level\":3,\"faceit_elo\":1017,\"game_player_name\":\"Add@V!\",\"skill_level_label\":\"\",\"regions\":{},\"game_profile_id\":\"\"},\"csgo\":{\"region\":\"EU\",\"game_player_id\":\"76561198114905304\",\"skill_level\":6,\"faceit_elo\":1402,\"game_player_name\":\"Add@Voff.\",\"skill_level_label\":\"\",\"regions\":{},\"game_profile_id\":\"\"}},\"settings\":{\"language\":\"pl\"},\"friends_ids\":[\"0e63b4d6-d079-40ae-8964-56c12aad89de\",\"1e90a7b1-f62e-4a3a-b4f5-b86de07845c6\",\"f0363dd8-9854-47af-b7b2-321ab2d5881d\",\"94d25f33-44f0-49d0-9017-5d007f7391a3\",\"b6b115ca-28cf-4ba4-95dd-9baebb83193b\",\"145f6c81-a33a-44a8-a637-0a7f2b12c17e\",\"7eb55f4a-5cf2-4795-84fc-f0f4736f57b6\",\"a48150a9-c8e2-405f-948b-7692a51e2c21\",\"429be984-cf7c-4d77-8554-21deef1e3bf1\",\"ae969730-b3f7-4f79-958d-d0835b15f572\",\"6a234e37-c640-4f0e-abd3-d23794f22c4f\",\"628af137-cdff-44aa-8400-9e3bcef5228b\",\"6679b62a-0049-4760-bc2b-b6547cd36948\",\"99cfcb6c-be43-4c33-8eb3-905a6fdf501a\",\"f4138a6b-a7f9-49a7-9bc4-2fa8c549587a\",\"acf019e7-3122-43c3-8314-edb7bf7e3f26\",\"627c3af8-78cd-43ae-b2e8-c1f0a801d768\",\"fa8e021b-cfa4-4554-a6c1-52edffda108a\",\"1b3fbc99-2620-4e74-ac73-b1188ae45389\",\"310d20bb-4e8d-47d8-a221-925f3216216a\",\"bb2beb73-b24f-4662-9b9c-9f66285df9a5\",\"d2daba26-b8c1-4fb9-bf2c-bc5c8971b55e\",\"057fc8b7-102f-42a6-8e95-eb25ae9e1417\",\"e1e21e0a-13de-44ee-b809-e3d8eacd9682\",\"dc18d25a-0f35-4b83-be9b-56113e46cc13\",\"67e42ff0-ea1b-4f65-b0f3-c8de117331b1\",\"0ca8dc3f-f80c-4814-9e6d-c34bba645356\",\"249fdd88-0629-4513-92f7-c83f3608ff81\",\"b543bae0-e9e7-470c-a2d5-5d56f9adac44\",\"cbdc65e4-0146-487b-8839-696161e29680\"],\"new_steam_id\":\"[U:1:154639576]\",\"steam_id_64\":\"76561198114905304\",\"steam_nickname\":\"Add@V!\",\"memberships\":[\"free\"],\"faceit_url\":\"https://www.faceit.com/{lang}/players/AddaV\",\"membership_type\":\"\",\"cover_featured_image\":\"\",\"infractions\":{}}";
    @Test
    public void parse() throws JsonProcessingException {


        Assert.assertEquals("6604a99e-198a-482c-80da-9360beb1120e",Json.parse(source).get("player_id").asText());

    }

}

package com.bigfire.reverse.wzdj.pojo.srcVo;
import java.util.*;
import java.lang.*;
import io.protostuff.Tag;
import lombok.*;
public class Wzdj {

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightSyncResource  {
    @Tag(1)
    Integer side;
    @Tag(2)
    String resourceid;
    @Tag(3)
    Integer delta;
    @Tag(4)
    Integer after;
    @Tag(5)
    Integer reason;
    @Tag(6)
    List<String> reasonparams = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientAdvertAll  {
    @Tag(1)
    List<AdvertInfo> info = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDanInfo  {
    @Tag(1)
    DanInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RankInfo  {
    @Tag(1)
    BasicInfo basicinfo;
    @Tag(2)
    List<FighterInfo> fighters = new java.util.ArrayList<>();
    @Tag(3)
    Integer rank;
    @Tag(4)
    Long rankval;
    @Tag(5)
    String extend;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientAdvertReward  {
    @Tag(1)
    Integer advertid;
    @Tag(2)
    String param;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientNoticeRead  {
    @Tag(1)
    String noticeid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightResultPvpPlayerData  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    GameRecord gamerecord;
    @Tag(3)
    FightPlayerStatData stat;
    @Tag(4)
    Integer addexp;
    @Tag(5)
    Integer addscore;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientHeroSignInInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long endtime;
    @Tag(3)
    List<HeroSignInData> signindatas = new java.util.ArrayList<>();
    @Tag(4)
    Integer resigncnt;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class MatchPlayerData  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    String battlefieldskin;
    @Tag(3)
    Map<String,String> fighterskins = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemePassClaimReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer rewardtype;
    @Tag(3)
    Integer level;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HealData  {
    @Tag(1)
    Integer casterid;
    @Tag(2)
    Integer targetid;
    @Tag(3)
    Long heal;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserReserve  {
    @Tag(1)
    UserReserve request;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightRemoveActors  {
    @Tag(1)
    List<ActorRemoveData> removeactors = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemePassUpgrade  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer up;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientAchieveInfo  {
    @Tag(1)
    List<AchieveInfo> achievelist = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerStageSwitch  {
    @Tag(1)
    Integer battletype;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserFrameList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientPassportMultipleExpInfo  {
    @Tag(1)
    Integer multiple;
    @Tag(2)
    Integer total;
    @Tag(3)
    Integer remain;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class MailInfo  {
    @Tag(1)
    Long time;
    @Tag(2)
    String type;
    @Tag(3)
    String mailid;
    @Tag(4)
    Boolean isread;
    @Tag(5)
    String title;
    @Tag(6)
    String content;
    @Tag(7)
    List<Reward> reward = new java.util.ArrayList<>();
    @Tag(8)
    Boolean ispick;
    @Tag(9)
    Long timeremain;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterRecruit  {
    @Tag(1)
    List<RewardInfo> appearlist = new java.util.ArrayList<>();
    @Tag(2)
    List<Integer> acquirelist = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightMissionList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendFightInviteCancel  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer fromid;
    @Tag(3)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserView  {
    @Tag(1)
    UserViewInfo viewinfo;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightWaveSelect  {
    @Tag(1)
    Integer index;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightNewbieNextWave  {
    @Tag(1)
    Integer wave;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightRoomJoin  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String token;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FighterInfo  {
    @Tag(1)
    String type;
    @Tag(2)
    Long totaldmg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightResultPlayerData  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    FightPlayerStatData stat;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightPvpWinRewardGet  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerNoticeList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterLike  {
    @Tag(1)
    List<String> fighters = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HeroTokenInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer level;
    @Tag(3)
    Long exp;
    @Tag(4)
    Integer tokenstate;
    @Tag(5)
    List<HeroTokenClaimedReward> claimedrewards = new java.util.ArrayList<>();
    @Tag(6)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterGrid  {
    @Tag(1)
    Map<Integer,Integer> actorgrids = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientNoticeQqNum  {
    @Tag(1)
    String qqnumstr;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class KvLong  {
    @Tag(1)
    String k;
    @Tag(2)
    Long v;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserIsNew  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerSignInReward  {
    @Tag(1)
    Integer day;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPlayerOnlineStatus  {
    @Tag(1)
    Integer uid;
    @Tag(2)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientShopInfoAll  {
    @Tag(1)
    List<ShopInfo> allshopinfo = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientNoticeDelete  {
    @Tag(1)
    String noticeid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLightLampLotteryColReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer colrewardid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserChangeAvatar  {
    @Tag(1)
    String avatar;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterTeleportAll  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerShopReadRed  {
    @Tag(1)
    Integer shopid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerPassportInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class CoRankInfo  {
    @Tag(1)
    CoPlayerInfo leftuser;
    @Tag(2)
    CoPlayerInfo rightuser;
    @Tag(3)
    Integer rank;
    @Tag(4)
    Long rankval;
    @Tag(5)
    String extend;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HeroTreasureHuntDrawRecord  {
    @Tag(1)
    Long ts;
    @Tag(2)
    Integer pos;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserChangeSkin  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String skin;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class StageRewardData  {
    @Tag(1)
    Integer stage;
    @Tag(2)
    List<Integer> status = new java.util.ArrayList<>();
    @Tag(3)
    Integer periodstatus;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientCmd  {
    @Tag(1)
    String result;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendFight  {
    @Tag(1)
    Integer frienduid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientRoleCreate  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendReadChat  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroTreasureHuntInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMatchCancel  {
    @Tag(1)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDailyMissionPointReward  {
    @Tag(1)
    Integer index;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientCloseReason  {
    @Tag(1)
    Integer code;
    @Tag(2)
    I18nString msg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterAttrsShow  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Map<Integer,Long> baseattrs = new java.util.HashMap<>();
    @Tag(3)
    Map<Integer,Long> attrs = new java.util.HashMap<>();
    @Tag(4)
    Map<String,String> extraparams = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TeleportData  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Integer fromgrid;
    @Tag(3)
    Integer togrid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientShopDel  {
    @Tag(1)
    Integer shopid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerDanRewardBatch  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterCall  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ItemInfo  {
    @Tag(1)
    String itemid;
    @Tag(2)
    Long amount;
    @Tag(3)
    Long expired;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterLike  {
    @Tag(1)
    String fighterid;
    @Tag(2)
    Boolean like;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMissionTypeInfo  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterAttrs  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Map<Integer,Long> baseattrs = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightNewbieNextWave  {
    @Tag(1)
    Integer wave;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterRecruitInfo  {
    @Tag(1)
    Boolean free;
    @Tag(2)
    Integer nextfreereq;
    @Tag(3)
    Integer num;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class BossHardData  {
    @Tag(1)
    Integer cfgid;
    @Tag(2)
    Integer time;
    @Tag(3)
    Integer count;
    @Tag(4)
    Integer total;
    @Tag(5)
    Map<Integer,Long> dmg = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientThemeSignActInfo  {
    @Tag(1)
    ThemeSignInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerGuaranteeLotteryChooseReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer bigrewardidx;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerNameReport  {
    @Tag(1)
    Integer targetuid;
    @Tag(2)
    String targetname;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMonsterEliteCall  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientShopInfoOne  {
    @Tag(1)
    ShopInfo shopinfo;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class UserReserve  {
    @Tag(1)
    String cmd;
    @Tag(2)
    String param;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class OneMissionInfo  {
    @Tag(1)
    String missid;
    @Tag(2)
    List<KvLong> progress = new java.util.ArrayList<>();
    @Tag(3)
    Integer state;
    @Tag(4)
    Boolean advert;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class DailyMissionPoint  {
    @Tag(1)
    Integer index;
    @Tag(2)
    Boolean reward;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightSyncSnapshot  {
    @Tag(1)
    SnapshotData snapshot;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDanRewardInfo  {
    @Tag(1)
    Integer type;
    @Tag(2)
    List<Integer> normalreward = new java.util.ArrayList<>();
    @Tag(3)
    List<Integer> luxuryreward = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightSkillEffect  {
    @Tag(1)
    Integer casterid;
    @Tag(2)
    List<Integer> targetids = new java.util.ArrayList<>();
    @Tag(3)
    String skillid;
    @Tag(4)
    String effectid;
    @Tag(5)
    Map<String,String> extraparams = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeContinuousCharge  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendDel  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserChangeFrame  {
    @Tag(1)
    String frame;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerExitChatChannel  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendFightInvite  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer toid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightAccelerate  {
    @Tag(1)
    Integer side;
    @Tag(2)
    Integer rate;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserFrameList  {
    @Tag(1)
    List<ExternalShow> frames = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightMatch  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendFightInvite  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer toid;
    @Tag(3)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerRelicLvUp  {
    @Tag(1)
    String relicid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerAchieveInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerPayCreateOrder  {
    @Tag(1)
    Integer shopid;
    @Tag(2)
    Integer goodsid;
    @Tag(3)
    String productid;
    @Tag(4)
    String currency;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterRecruitAdvancedMode  {
    @Tag(1)
    Integer mode;
    @Tag(2)
    Long timeleft;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientPassportNormalReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightRoomJoinFromShare  {
    @Tag(1)
    String sharetoken;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerStageRewardGet  {
    @Tag(1)
    Integer battletype;
    @Tag(2)
    Integer stage;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPlayerList  {
    @Tag(1)
    List<FightPlayerData> players = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightLoginFinish  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterSkinList  {
    @Tag(1)
    List<ExternalShow> skins = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerClearPvpRecord  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMissionList  {
    @Tag(1)
    List<TypeMissionInfo> allinfo = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class UsingSkin  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String id;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientPassportLvExp  {
    @Tag(1)
    Integer lv;
    @Tag(2)
    Integer exp;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientRelicList  {
    @Tag(1)
    List<RelicData> relics = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserProp  {
    @Tag(1)
    UserProp userprop;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeActInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroTreasureHuntDraw  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer drawtimes;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientShopMultiDiamondInfo  {
    @Tag(1)
    List<Integer> goods = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPvpPushResult  {
    @Tag(1)
    Boolean auth;
    @Tag(2)
    Integer winner;
    @Tag(3)
    Integer reason;
    @Tag(4)
    List<FightResultPvpPlayerData> players = new java.util.ArrayList<>();
    @Tag(5)
    List<FightPvpReward> reward = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightBossHardData  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class NoticeInfo  {
    @Tag(1)
    String type;
    @Tag(2)
    String id;
    @Tag(3)
    Long begintime;
    @Tag(4)
    Long endtime;
    @Tag(5)
    String title;
    @Tag(6)
    String content;
    @Tag(7)
    Boolean read;
    @Tag(8)
    String imgposition;
    @Tag(9)
    Integer istop;
    @Tag(10)
    String bannerurl;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMissionUpdate  {
    @Tag(1)
    OneMissionInfo oneinfo;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMissionList  {
    @Tag(1)
    List<FightMissionData> missions = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientNoticeNew  {
    @Tag(1)
    NoticeInfo notice;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterRemove  {
    @Tag(1)
    Integer grid;
    @Tag(2)
    Integer id;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendFightInviteOp  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer fromid;
    @Tag(3)
    Integer op;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class KvStr  {
    @Tag(1)
    String k;
    @Tag(2)
    String v;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroSignInInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailAdd  {
    @Tag(1)
    MailInfo mail;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMissionInfo  {
    @Tag(1)
    Integer misscnt;
    @Tag(2)
    Integer refreshcnt;
    @Tag(3)
    String curmissid;
    @Tag(4)
    Integer missstatus;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightCoopHardResult  {
    @Tag(1)
    Boolean auth;
    @Tag(2)
    Integer wave;
    @Tag(3)
    Integer maxwave;
    @Tag(4)
    Integer reason;
    @Tag(5)
    List<FightResultPlayerData> players = new java.util.ArrayList<>();
    @Tag(6)
    List<RewardInfo> rewards = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ThemeContinuousChargeInfo  {
    @Tag(1)
    Integer curdayno;
    @Tag(2)
    Integer gifttag;
    @Tag(3)
    Integer buyeddayno;
    @Tag(4)
    Integer bigrewardstatus;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightWaveStage  {
    @Tag(1)
    WaveData wavedata;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientGuaranteeLottery  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    GuaranteeLotteryData data;
    @Tag(3)
    List<Integer> rewardids = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightBossHardData  {
    @Tag(1)
    BossHardData bossdata;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerShopInfoOne  {
    @Tag(1)
    Integer shopid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMissionRefresh  {
    @Tag(1)
    String missid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroActInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class KvIntInt  {
    @Tag(1)
    Integer k;
    @Tag(2)
    Integer v;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserModuleGuide  {
    @Tag(1)
    Integer moduleid;
    @Tag(2)
    Integer guideid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerBackHome  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightMissionRewardGet  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerOneFighter  {
    @Tag(1)
    String fighterid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientPassportInfo  {
    @Tag(1)
    PassportInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightRoomMiss  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String tips;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerPassportNormalReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMailOneKeyReceive  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterCall  {
    @Tag(1)
    Integer callcost;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserSetAvatarNameByAuth  {
    @Tag(1)
    String avatar;
    @Tag(2)
    String name;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterRecruitAdvancedWish  {
    @Tag(1)
    String fighterid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerOneRelic  {
    @Tag(1)
    String relicid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerGuaranteeLottery  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer lotterytimes;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FighterDmgData  {
    @Tag(1)
    String actorid;
    @Tag(2)
    Integer lv;
    @Tag(3)
    Long dmg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeSignActReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer day;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFirstPayGiftInfo  {
    @Tag(1)
    Boolean isbuyed;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerAdvertInfo  {
    @Tag(1)
    Integer advertid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightCreateBullet  {
    @Tag(1)
    BulletData bullet;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FriendInfoAll  {
    @Tag(1)
    List<FriendInfo> myfriends = new java.util.ArrayList<>();
    @Tag(2)
    List<FriendInfo> beapplys = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterSkinSwitch  {
    @Tag(1)
    String fighterid;
    @Tag(2)
    String skinid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientBackHome  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientChatHistory  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
    @Tag(3)
    List<ChatHistory> results = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerAdvertBegin  {
    @Tag(1)
    Integer advertid;
    @Tag(2)
    String param;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserChangeAvatar  {
    @Tag(1)
    String avatar;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserToken  {
    @Tag(1)
    String key;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserAvatarList  {
    @Tag(1)
    List<ExternalShow> avatars = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightMatchCancel  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightSkill  {
    @Tag(1)
    SkillData skill;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerShopRefresh  {
    @Tag(1)
    Integer shopid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientLightLampLotteryInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long endtime;
    @Tag(3)
    LightLampLotteryData data;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightBuffRemove  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Integer reason;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendRefuseBeApply  {
    @Tag(1)
    List<Integer> refuseuid = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserRename  {
    @Tag(1)
    String name;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendFightInviteOp  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer fromid;
    @Tag(3)
    Integer op;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeContinuousChargeBigReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer gifttag;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class PassportInfo  {
    @Tag(1)
    Integer season;
    @Tag(2)
    Integer rewardid;
    @Tag(3)
    Long timeleft;
    @Tag(4)
    Integer lv;
    @Tag(5)
    Integer exp;
    @Tag(6)
    Integer passtype;
    @Tag(7)
    List<Integer> normalreward = new java.util.ArrayList<>();
    @Tag(8)
    List<Integer> luxuryreward = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLightLampLotteryRowReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer rowrewardid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerAdvertEnd  {
    @Tag(1)
    Integer advertid;
    @Tag(2)
    String param;
    @Tag(3)
    String transid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightEnhance  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class DmgData  {
    @Tag(1)
    Long dmg;
    @Tag(2)
    Integer casterid;
    @Tag(3)
    Integer targetid;
    @Tag(4)
    Boolean crit;
    @Tag(5)
    Integer dmgtype;
    @Tag(6)
    Integer skilltype;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ThemeActInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer fake;
    @Tag(3)
    Map<Integer,Integer> mapactid = new java.util.HashMap<>();
    @Tag(4)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TokenClaimedReward  {
    @Tag(1)
    Integer rewardtype;
    @Tag(2)
    List<Integer> levels = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientSignInReward  {
    @Tag(1)
    Integer day;
    @Tag(2)
    Integer rewardstatus;
    @Tag(3)
    Integer resigncnt;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientItemList  {
    @Tag(1)
    List<ItemInfo> items = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendFightInviteCancel  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientLightLampLottery  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    List<Integer> gridids = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterFirstBuy  {
    @Tag(1)
    String id;
    @Tag(2)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserLv  {
    @Tag(1)
    Integer lv;
    @Tag(2)
    Integer exp;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterCritDmg  {
    @Tag(1)
    Integer critdmg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientChatSend  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
    @Tag(3)
    ChatHistory result;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroPassClaimReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer rewardtype;
    @Tag(3)
    Integer level;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientGuaranteeLotteryItemsUpdate  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long ticketnum;
    @Tag(3)
    Long rockernum;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterRecruitAdvancedInfo  {
    @Tag(1)
    Integer progress;
    @Tag(2)
    String wishfighter;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDailyFortuneRefresh  {
    @Tag(1)
    Integer refreshtimes;
    @Tag(2)
    RewardInfo reward;
    @Tag(3)
    RewardInfo cost;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class Kv  {
    @Tag(1)
    String k;
    @Tag(2)
    Integer v;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightEnhance  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class PayOrderInfo  {
    @Tag(1)
    Boolean ok;
    @Tag(2)
    Integer shopid;
    @Tag(3)
    Integer goodsid;
    @Tag(4)
    String productid;
    @Tag(5)
    String extraproductid;
    @Tag(6)
    String price;
    @Tag(7)
    String orderid;
    @Tag(8)
    String ordersign;
    @Tag(9)
    String extra;
    @Tag(10)
    String notifypath;
    @Tag(11)
    Integer ret;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerWelfareMissionAddProgress  {
    @Tag(1)
    String missionid;
    @Tag(2)
    Long progress;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class SnapshotData  {
    @Tag(1)
    List<FightPlayerData> players = new java.util.ArrayList<>();
    @Tag(2)
    List<FightActorData> actors = new java.util.ArrayList<>();
    @Tag(3)
    List<BuffData> buffs = new java.util.ArrayList<>();
    @Tag(4)
    WaveData wavedata;
    @Tag(5)
    List<FightActorData> globalactors = new java.util.ArrayList<>();
    @Tag(6)
    Integer frame;
    @Tag(7)
    Integer accelerate;
    @Tag(8)
    Integer state;
    @Tag(9)
    Integer operateid;
    @Tag(10)
    BossHardData bosshard;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientHeroActInfo  {
    @Tag(1)
    HeroActInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailDelete  {
    @Tag(1)
    String mailid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserSkinList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFrameEnd  {
    @Tag(1)
    Integer frame;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class I18nString  {
    @Tag(1)
    String format;
    @Tag(2)
    Map<String,String> params = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDanLuxuryReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterRecruit  {
    @Tag(1)
    Integer num;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightMissionRefresh  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMissionDelete  {
    @Tag(1)
    String missid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightActorsDistance  {
    @Tag(1)
    Integer actortype;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientPassportLuxuryReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class WaveData  {
    @Tag(1)
    Integer wave;
    @Tag(2)
    Integer stage;
    @Tag(3)
    Integer time;
    @Tag(4)
    String bossid;
    @Tag(5)
    Integer showwave;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientThemeActMission  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLimitShopDailyGiftGet  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TreasureData  {
    @Tag(1)
    Integer id;
    @Tag(2)
    String actorid;
    @Tag(3)
    Integer quality;
    @Tag(4)
    Map<String,Long> params = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerCmd  {
    @Tag(1)
    String cmd;
    @Tag(2)
    String args;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPvpWinReward  {
    @Tag(1)
    Integer win;
    @Tag(2)
    Integer need;
    @Tag(3)
    Integer reward;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerEnterChatChannel  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerGuaranteeLotteryInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerRelicList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendAdd  {
    @Tag(1)
    FriendInfo addfriend;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TipsInfo  {
    @Tag(1)
    Integer moduleid;
    @Tag(2)
    Integer count;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendReadBeApplyFriends  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerPassportRewardBatch  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerDanNormalReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightRoomCreate  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class AdvertInfo  {
    @Tag(1)
    Integer advertid;
    @Tag(2)
    Integer cdtime;
    @Tag(3)
    Integer viewtimes;
    @Tag(4)
    Integer totaltimes;
    @Tag(5)
    Long resettime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendSearchByUid  {
    @Tag(1)
    FriendInfo result;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterAttrsShow  {
    @Tag(1)
    Integer id;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightPlayerStat  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroTreasureHuntLapReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer lapidx;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerNoticeQqNum  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerDailyMissionPointReward  {
    @Tag(1)
    Integer index;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ChatHistory  {
    @Tag(1)
    Long msgid;
    @Tag(2)
    String content;
    @Tag(3)
    Integer type;
    @Tag(4)
    String extra;
    @Tag(5)
    Long ts;
    @Tag(6)
    BasicInfo senderuser;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightNewbiePause  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserActivationCode  {
    @Tag(1)
    String code;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserSkinList  {
    @Tag(1)
    List<ExternalShow> myskins = new java.util.ArrayList<>();
    @Tag(2)
    List<UsingSkin> usingskins = new java.util.ArrayList<>();
    @Tag(3)
    List<ExternalShow> showskins = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDailyMissionPointSync  {
    @Tag(1)
    Integer point;
    @Tag(2)
    List<DailyMissionPoint> dailymissionpoints = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightMissionData  {
    @Tag(1)
    String missionid;
    @Tag(2)
    Long progress;
    @Tag(3)
    Long totalprogress;
    @Tag(4)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserChangeSkin  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String skin;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightWaveSelectFinish  {
    @Tag(1)
    Integer index;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightMonsterEliteCall  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterMove  {
    @Tag(1)
    Integer fromgrid;
    @Tag(2)
    Integer togrid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendFightInviteOpNotice  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer fromid;
    @Tag(3)
    Integer op;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendSearchByUid  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserNewbieGuide  {
    @Tag(1)
    Integer guideid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TokenInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer level;
    @Tag(3)
    Long exp;
    @Tag(4)
    Long props;
    @Tag(5)
    Integer dailyexp;
    @Tag(6)
    Integer tokenstate;
    @Tag(7)
    List<TokenClaimedReward> claimedrewards = new java.util.ArrayList<>();
    @Tag(8)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class AchieveInfo  {
    @Tag(1)
    Integer achieveid;
    @Tag(2)
    Integer stage;
    @Tag(3)
    Long progress;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroSignInReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer day;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientItemOne  {
    @Tag(1)
    ItemInfo item;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientCommonRewardAdd  {
    @Tag(1)
    List<RewardInfo> rewards = new java.util.ArrayList<>();
    @Tag(2)
    List<PackInfo> packs = new java.util.ArrayList<>();
    @Tag(3)
    Integer reason;
    @Tag(4)
    List<String> reasonparam = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerDailyFortuneRefresh  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightPlayerData  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    Integer side;
    @Tag(3)
    Map<Integer,Integer> enhancelv = new java.util.HashMap<>();
    @Tag(4)
    Map<String,Integer> resources = new java.util.HashMap<>();
    @Tag(5)
    Map<Integer,Integer> betrates = new java.util.HashMap<>();
    @Tag(6)
    Map<Integer,Integer> callrates = new java.util.HashMap<>();
    @Tag(7)
    List<FightFighterData> fighters = new java.util.ArrayList<>();
    @Tag(8)
    Integer callcost;
    @Tag(9)
    Integer elitemonster;
    @Tag(10)
    List<WaveSelectData> selectdata = new java.util.ArrayList<>();
    @Tag(11)
    FightMissionData randmission;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFrameBegin  {
    @Tag(1)
    Integer frame;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class PackInfo  {
    @Tag(1)
    String itemid;
    @Tag(2)
    List<RewardInfo> rewards = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class UserProp  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    GameRecord record;
    @Tag(3)
    Integer wizard;
    @Tag(4)
    Long timestamp;
    @Tag(5)
    Long createtime;
    @Tag(6)
    Boolean isnew;
    @Tag(7)
    Integer renamecnt;
    @Tag(8)
    Boolean noadvert;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterSyntheticMythic  {
    @Tag(1)
    String actorid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFirstRechargeGiftGet  {
    @Tag(1)
    String id;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientLimitShopDailyGift  {
    @Tag(1)
    Integer got;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerSignInInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientAdvertInfo  {
    @Tag(1)
    AdvertInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMailReceive  {
    @Tag(1)
    String mailid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLightLampLottery  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer lotterytimes;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserView  {
    @Tag(1)
    Integer uid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterOperate  {
    @Tag(1)
    Integer id;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HeroTreasureHuntData  {
    @Tag(1)
    Integer curpos;
    @Tag(2)
    Integer curlaps;
    @Tag(3)
    Long hunttickets;
    @Tag(4)
    List<Integer> claimedlaprewards = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterTreasures  {
    @Tag(1)
    Integer id;
    @Tag(2)
    List<TreasureData> treasures = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailOneKeyReceive  {
    @Tag(1)
    List<String> mailids = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RelicData  {
    @Tag(1)
    String relicid;
    @Tag(2)
    Integer lv;
    @Tag(3)
    Integer pieces;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientThemeActGift  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Map<Integer,Integer> buyinfo = new java.util.HashMap<>();
    @Tag(3)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendDel  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightActorAttrs  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Map<Integer,Long> attrs = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientThemePassInfo  {
    @Tag(1)
    TokenInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientEnterChatChannel  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightPvpReward  {
    @Tag(1)
    Integer type;
    @Tag(2)
    List<RewardInfo> rewards = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class KvDouble  {
    @Tag(1)
    String k;
    @Tag(2)
    Double v;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightWaveSelect  {
    @Tag(1)
    Integer side;
    @Tag(2)
    List<WaveSelectData> selectdata = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserRename  {
    @Tag(1)
    String name;
    @Tag(2)
    Integer renamecnt;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientHeroTreasureHuntInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long endtime;
    @Tag(3)
    HeroTreasureHuntData data;
    @Tag(4)
    List<HeroTreasureHuntDrawRecord> drawrecords = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightBuffUpdate  {
    @Tag(1)
    BuffData buff;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightFighterData  {
    @Tag(1)
    String fighterid;
    @Tag(2)
    Integer lv;
    @Tag(3)
    Boolean like;
    @Tag(4)
    Boolean trial;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightNewbieResume  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientEnterScene  {
    @Tag(1)
    Integer sceneid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientTotalSignInReward  {
    @Tag(1)
    Integer index;
    @Tag(2)
    Integer rewardstatus;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendApplyAdd  {
    @Tag(1)
    FriendInfo apply;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserChangeFrame  {
    @Tag(1)
    String frame;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightPlayerStatData  {
    @Tag(1)
    Integer uid;
    @Tag(2)
    Long totaldmg;
    @Tag(3)
    Integer killmonsternum;
    @Tag(4)
    Integer killbossnum;
    @Tag(5)
    Integer killelitenum;
    @Tag(6)
    Map<Integer,Integer> quality2fighter = new java.util.HashMap<>();
    @Tag(7)
    Map<Integer,Integer> betdata = new java.util.HashMap<>();
    @Tag(8)
    Map<Integer,Integer> enhancetimes = new java.util.HashMap<>();
    @Tag(9)
    List<FighterDmgData> fighterdmg = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserAvatarAdd  {
    @Tag(1)
    ExternalShow avatar;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterLvUp  {
    @Tag(1)
    String fighterid;
    @Tag(2)
    Boolean convert;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FirstRechargeGiftData  {
    @Tag(1)
    String id;
    @Tag(2)
    Boolean buy;
    @Tag(3)
    Map<Integer,Integer> daymap = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightEnd  {
    @Tag(1)
    Integer result;
    @Tag(2)
    Integer reason;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightRoomDismiss  {
    @Tag(1)
    String token;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightRewardTimes  {
    @Tag(1)
    Map<Integer,Integer> rewardtimes = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientOneAchieveInfo  {
    @Tag(1)
    AchieveInfo achieveinfo;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientSignInAll  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    List<SignInData> signindatas = new java.util.ArrayList<>();
    @Tag(3)
    List<TotalSignInRewardData> totalsigninrewarddatas = new java.util.ArrayList<>();
    @Tag(4)
    Integer resigncnt;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightAccelerate  {
    @Tag(1)
    Integer rate;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterOperate  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Integer speciallv;
    @Tag(3)
    Map<String,String> extraparams = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class WaveSelectData  {
    @Tag(1)
    Integer quality;
    @Tag(2)
    Integer type;
    @Tag(3)
    Integer rate;
    @Tag(4)
    String actorid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientTellmeI18n  {
    @Tag(1)
    Integer type;
    @Tag(2)
    I18nString msg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightErrCode  {
    @Tag(1)
    Integer errcode;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendSearchByName  {
    @Tag(1)
    List<FriendInfo> results = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeActMission  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemePassInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerTotalSignInReward  {
    @Tag(1)
    Integer index;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterAttrs  {
    @Tag(1)
    Integer id;
    @Tag(2)
    String actorid;
    @Tag(3)
    Map<Integer,Long> baseattrs = new java.util.HashMap<>();
    @Tag(4)
    Map<Integer,Long> attrs = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FriendInfo  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    Integer status;
    @Tag(3)
    Long ts;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerDanLuxuryReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterRecruitProbInfo  {
    @Tag(1)
    List<FighterProb> list = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMailRead  {
    @Tag(1)
    String mailid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightRoomDestroy  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String token;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightNewbieGuide  {
    @Tag(1)
    Integer operateid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPvpCircleResult  {
    @Tag(1)
    Boolean auth;
    @Tag(2)
    Integer winner;
    @Tag(3)
    Integer reason;
    @Tag(4)
    List<FightResultPvpPlayerData> players = new java.util.ArrayList<>();
    @Tag(5)
    List<FightPvpReward> reward = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class LightLampLotteryData  {
    @Tag(1)
    List<Integer> gridrewards = new java.util.ArrayList<>();
    @Tag(2)
    Map<Integer,Integer> colstatus = new java.util.HashMap<>();
    @Tag(3)
    Map<Integer,Integer> rowstatus = new java.util.HashMap<>();
    @Tag(4)
    Map<Integer,Integer> linestatus = new java.util.HashMap<>();
    @Tag(5)
    Integer linenum;
    @Tag(6)
    Long wishitems;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMonsterEliteAppear  {
    @Tag(1)
    Integer elitemonster;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPassReward  {
    @Tag(1)
    Map<Integer,Integer> rewards = new java.util.HashMap<>();
    @Tag(2)
    Long refreshtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserNewbieGuide  {
    @Tag(1)
    Integer guideid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerChatSend  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
    @Tag(3)
    ChatMsg msg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ExternalShow  {
    @Tag(1)
    String id;
    @Tag(2)
    Long time;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMailOneKeyDelete  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterTeleport  {
    @Tag(1)
    List<TeleportData> teleports = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class GameRecord  {
    @Tag(1)
    Integer cleartimes;
    @Tag(2)
    Integer maxstage;
    @Tag(3)
    Integer maxkill;
    @Tag(4)
    Integer hardclear;
    @Tag(5)
    Integer hardstage;
    @Tag(6)
    Integer hardkill;
    @Tag(7)
    Integer danscoremax;
    @Tag(8)
    Integer continuouswin;
    @Tag(9)
    Integer wintimes;
    @Tag(10)
    Integer totaltimes;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMatchFail  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDanNormalReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TypeMissionInfo  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Long time;
    @Tag(3)
    Integer rewardget;
    @Tag(4)
    Boolean advert;
    @Tag(5)
    List<OneMissionInfo> missions = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HeroActInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer fake;
    @Tag(3)
    Map<Integer,Integer> mapactid = new java.util.HashMap<>();
    @Tag(4)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class UserViewInfo  {
    @Tag(1)
    BasicInfo userinfo;
    @Tag(2)
    GameRecord record;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class KvIntLong  {
    @Tag(1)
    Integer k;
    @Tag(2)
    Long v;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class CoPlayerInfo  {
    @Tag(1)
    BasicInfo basicinfo;
    @Tag(2)
    List<FighterInfo> fighters = new java.util.ArrayList<>();
    @Tag(3)
    Long totaldmg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientEnergy  {
    @Tag(1)
    Integer energy;
    @Tag(2)
    Integer next;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMissionUpdate  {
    @Tag(1)
    Integer side;
    @Tag(2)
    FightMissionData mission;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFirstRechargeGiftAll  {
    @Tag(1)
    List<FirstRechargeGiftData> gifts = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserAvatarList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMissionRefreshState  {
    @Tag(1)
    Boolean state;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class TotalSignInRewardData  {
    @Tag(1)
    Integer index;
    @Tag(2)
    Integer rewardstatus;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HeroTokenClaimedReward  {
    @Tag(1)
    Integer rewardtype;
    @Tag(2)
    List<Integer> levels = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientThemeActInfo  {
    @Tag(1)
    ThemeActInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightWaveEnd  {
    @Tag(1)
    Integer wave;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterJoin  {
    @Tag(1)
    Integer side;
    @Tag(2)
    Integer id;
    @Tag(3)
    Integer fromgrid;
    @Tag(4)
    Integer togrid;
    @Tag(5)
    Integer delaytime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroPassInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightNewbieGuide  {
    @Tag(1)
    Integer operateid;
    @Tag(2)
    String param;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendApplyAdd  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDeleteChat  {
    @Tag(1)
    Long msgid;
    @Tag(2)
    Integer chattype;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ThemeSignInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer day;
    @Tag(3)
    Map<Integer,Integer> signdays = new java.util.HashMap<>();
    @Tag(4)
    Long endtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightRoomDestroy  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightPassRewardGet  {
    @Tag(1)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerChatHistory  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
    @Tag(3)
    Integer msgid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientOneFighter  {
    @Tag(1)
    FighterData fighter;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class BulletData  {
    @Tag(1)
    String bulletid;
    @Tag(2)
    Integer casterid;
    @Tag(3)
    Integer targetid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientTipsInfo  {
    @Tag(1)
    TipsInfo tips;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightdHost  {
    @Tag(1)
    String token;
    @Tag(2)
    String ip;
    @Tag(3)
    Integer port;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterRecruitAdvanced  {
    @Tag(1)
    Integer num;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientGuaranteeLotteryInfo  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long endtime;
    @Tag(3)
    GuaranteeLotteryData data;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientHeroPassInfo  {
    @Tag(1)
    HeroTokenInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightBegin  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class Reward  {
    @Tag(1)
    String key;
    @Tag(2)
    Long amount;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserModuleGuide  {
    @Tag(1)
    Map<Integer,Integer> moduleguides = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ActorRemoveData  {
    @Tag(1)
    Integer id;
    @Tag(2)
    Integer reason;
    @Tag(3)
    String reasonparams;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientStageInfo  {
    @Tag(1)
    Integer battletype;
    @Tag(2)
    List<StageRewardData> coop = new java.util.ArrayList<>();
    @Tag(3)
    List<StageRewardData> coophard = new java.util.ArrayList<>();
    @Tag(4)
    Integer coopperiodrefreshtime;
    @Tag(5)
    Integer coophardperiodrefreshtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightPlayerStat  {
    @Tag(1)
    List<FightPlayerStatData> statdata = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightBuffAdd  {
    @Tag(1)
    BuffData buff;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RewardInfo  {
    @Tag(1)
    String itemid;
    @Tag(2)
    Long amount;
    @Tag(3)
    Boolean isnew;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightNewbieResume  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientHeroTreasureHuntDraw  {
    @Tag(1)
    List<Integer> drawresults = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterSynthetic  {
    @Tag(1)
    Integer grid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerWelfareUpdateWxGameCircleInfo  {
    @Tag(1)
    String info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RankListInfo  {
    @Tag(1)
    Integer ranktype;
    @Tag(2)
    Integer rankid;
    @Tag(3)
    Long endtime;
    @Tag(4)
    List<RankInfo> rankinfos = new java.util.ArrayList<>();
    @Tag(5)
    List<CoRankInfo> corankinfos = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerGuaranteeLotteryTimesReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer timesid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerAdvertReward  {
    @Tag(1)
    Integer advertid;
    @Tag(2)
    String param;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendReadBeApplyFriends  {
    @Tag(1)
    Integer isred;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientDeleteUserChat  {
    @Tag(1)
    Integer targetid;
    @Tag(2)
    Integer chattype;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerNoticeRead  {
    @Tag(1)
    String noticeid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightNewbiePause  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientRankInfo  {
    @Tag(1)
    RankListInfo ranklist;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerShopInfoAll  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightRoomCreate  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String token;
    @Tag(3)
    Integer status;
    @Tag(4)
    String sharetoken;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientOneRelic  {
    @Tag(1)
    RelicData relic;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class HeroSignInData  {
    @Tag(1)
    Integer day;
    @Tag(2)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientPayCreateOrder  {
    @Tag(1)
    PayOrderInfo order;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFighterList  {
    @Tag(1)
    List<FighterData> fighters = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientNoticeList  {
    @Tag(1)
    List<NoticeInfo> notice = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerRankInfo  {
    @Tag(1)
    Integer ranktype;
    @Tag(2)
    Integer version;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailList  {
    @Tag(1)
    List<MailInfo> mails = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterRecruitProbInfo  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerChatReport  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
    @Tag(3)
    Integer targetuid;
    @Tag(4)
    String targetname;
    @Tag(5)
    String content;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FighterProb  {
    @Tag(1)
    String fighterid;
    @Tag(2)
    Integer rate;
    @Tag(3)
    Boolean canwish;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FighterData  {
    @Tag(1)
    String fighterid;
    @Tag(2)
    Integer lv;
    @Tag(3)
    Integer pieces;
    @Tag(4)
    Boolean canbuy;
    @Tag(5)
    String skin;
    @Tag(6)
    Long expired;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerShopBuy  {
    @Tag(1)
    Integer shopid;
    @Tag(2)
    Integer goodsid;
    @Tag(3)
    Integer buycnt;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterRecruitAdvancedSelect  {
    @Tag(1)
    String fighterid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientLoginFinish  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class DanInfo  {
    @Tag(1)
    Integer season;
    @Tag(2)
    Boolean offseason;
    @Tag(3)
    Long timeleft;
    @Tag(4)
    Integer battletype;
    @Tag(5)
    Integer score;
    @Tag(6)
    Integer maxscore;
    @Tag(7)
    Integer nextbattletype;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class SkillData  {
    @Tag(1)
    Integer casterid;
    @Tag(2)
    String skillid;
    @Tag(3)
    Long atkspeed;
    @Tag(4)
    Integer mtarget;
    @Tag(5)
    List<Integer> targetids = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailReceive  {
    @Tag(1)
    String mailid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMissionComplete  {
    @Tag(1)
    String missid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeActGift  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class LoginInfo  {
    @Tag(1)
    String internaltoken;
    @Tag(2)
    String avatar;
    @Tag(3)
    String channel;
    @Tag(4)
    String language;
    @Tag(5)
    String osversion;
    @Tag(6)
    Boolean relogin;
    @Tag(7)
    String udid;
    @Tag(8)
    String ip;
    @Tag(9)
    Map<String,String> extraparams = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class GuaranteeLotteryData  {
    @Tag(1)
    Long ticketnum;
    @Tag(2)
    Long rockernum;
    @Tag(3)
    Integer lotterytimes;
    @Tag(4)
    Integer bigrewardidx;
    @Tag(5)
    Integer guaranteetimes;
    @Tag(6)
    Integer hitbigrewardcnt;
    @Tag(7)
    Map<Integer,Integer> timesrewardsstatus = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightHitDmg  {
    @Tag(1)
    DmgData dmg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightLogin  {
    @Tag(1)
    Integer uid;
    @Tag(2)
    String token;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientAdvertFreeTime  {
    @Tag(1)
    Integer time;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerHeroSubActInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerThemeSubActInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMatchSuccess  {
    @Tag(1)
    FightdHost server;
    @Tag(2)
    List<MatchPlayerData> players = new java.util.ArrayList<>();
    @Tag(3)
    Integer type;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailOneKeyDelete  {
    @Tag(1)
    List<String> mailids = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientExitChatChannel  {
    @Tag(1)
    Integer chattype;
    @Tag(2)
    Integer channel;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLightLampLotteryLineReward  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Integer linerewardid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserFrameAdd  {
    @Tag(1)
    ExternalShow frame;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerPassportLuxuryReward  {
    @Tag(1)
    Integer lv;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLightLampLotteryInfo  {
    @Tag(1)
    Integer actid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserReserve  {
    @Tag(1)
    UserReserve response;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientCardInfo  {
    @Tag(1)
    Integer remain;
    @Tag(2)
    Integer bigremain;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class GoodsInfo  {
    @Tag(1)
    Integer goodsid;
    @Tag(2)
    Integer buycnt;
    @Tag(3)
    Integer maxbuycnt;
    @Tag(4)
    Long time;
    @Tag(5)
    Long lefttime;
    @Tag(6)
    Integer salestate;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightHeal  {
    @Tag(1)
    HealData heal;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class SignInData  {
    @Tag(1)
    Integer day;
    @Tag(2)
    Integer status;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class FightActorData  {
    @Tag(1)
    Integer id;
    @Tag(2)
    String actorid;
    @Tag(3)
    Integer side;
    @Tag(4)
    Integer actortype;
    @Tag(5)
    Integer grid;
    @Tag(6)
    Integer reason;
    @Tag(7)
    String reasonparams;
    @Tag(8)
    Integer distance;
    @Tag(9)
    Long alivetime;
    @Tag(10)
    Integer lv;
    @Tag(11)
    Integer speciallv;
    @Tag(12)
    Map<String,String> extraparams = new java.util.HashMap<>();
    @Tag(13)
    Map<Integer,Long> attrs = new java.util.HashMap<>();
    @Tag(14)
    Integer scene;
    @Tag(15)
    List<TreasureData> treasures = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerItemUse  {
    @Tag(1)
    String itemid;
    @Tag(2)
    Long amount;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerWelfareSubscription  {
    @Tag(1)
    List<Integer> sublist = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFighterList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightFighterTeleport  {
    @Tag(1)
    Integer fromgrid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMailList  {
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerMailDelete  {
    @Tag(1)
    String mailid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightMissionComplete  {
    @Tag(1)
    String missionid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ShopInfo  {
    @Tag(1)
    Integer shopid;
    @Tag(2)
    Long lefttime;
    @Tag(3)
    List<GoodsInfo> goodsinfo = new java.util.ArrayList<>();
    @Tag(4)
    Integer leftrefreshcnt;
    @Tag(5)
    Integer maxrefreshcnt;
    @Tag(6)
    Boolean isred;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightBetResult  {
    @Tag(1)
    Integer quality;
    @Tag(2)
    String fighterid;
    @Tag(3)
    Integer reason;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendOnlineStatus  {
    @Tag(1)
    Integer frienduid;
    @Tag(2)
    Integer status;
    @Tag(3)
    Long logouttime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientLoginTipsInfo  {
    @Tag(1)
    List<TipsInfo> tips = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightNewActors  {
    @Tag(1)
    List<FightActorData> actors = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class ChatMsg  {
    @Tag(1)
    Integer type;
    @Tag(2)
    String content;
    @Tag(3)
    String extra;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class BuffData  {
    @Tag(1)
    String buffid;
    @Tag(2)
    Integer id;
    @Tag(3)
    Integer layers;
    @Tag(4)
    Integer casterid;
    @Tag(5)
    Integer targetid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFightBet  {
    @Tag(1)
    Integer quality;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightWaveBegin  {
    @Tag(1)
    Integer wave;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientMailRead  {
    @Tag(1)
    String mailid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendSearchByName  {
    @Tag(1)
    String name;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightFighterMove  {
    @Tag(1)
    Integer side;
    @Tag(2)
    Integer fromgrid;
    @Tag(3)
    Integer togrid;
    @Tag(4)
    Integer gotime;
    @Tag(5)
    Integer backtime;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientHeroSignInReward  {
    @Tag(1)
    Integer day;
    @Tag(2)
    Integer rewardstatus;
    @Tag(3)
    Integer resigncnt;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendAgreeBeApply  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightCoopResult  {
    @Tag(1)
    Boolean auth;
    @Tag(2)
    Integer wave;
    @Tag(3)
    Integer maxwave;
    @Tag(4)
    Integer reason;
    @Tag(5)
    List<FightResultPlayerData> players = new java.util.ArrayList<>();
    @Tag(6)
    List<RewardInfo> rewards = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerSelectOptionalBoxReward  {
    @Tag(1)
    String key;
    @Tag(2)
    List<String> selectlist = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendFightInviteNotice  {
    @Tag(1)
    Integer type;
    @Tag(2)
    Integer fromid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFightActorsDistance  {
    @Tag(1)
    Integer actortype;
    @Tag(2)
    Map<Integer,Integer> id2distance = new java.util.HashMap<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerFriendRefuseBeApply  {
    @Tag(1)
    Integer targetuid;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerLogin  {
    @Tag(1)
    LoginInfo info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendUnreadChat  {
    @Tag(1)
    List<Integer> unreaduid = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientFriendInfo  {
    @Tag(1)
    FriendInfoAll info;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcServerUserClientError  {
    @Tag(1)
    String uuid;
    @Tag(2)
    String msg;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientUserSkinAdd  {
    @Tag(1)
    ExternalShow skin;
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class RpcClientThemeContinuousCharge  {
    @Tag(1)
    Integer actid;
    @Tag(2)
    Long endtime;
    @Tag(3)
    List<ThemeContinuousChargeInfo> infos = new java.util.ArrayList<>();
}

@Data
@NoArgsConstructor
@ProtobufClass
public static class BasicInfo  {
    @Tag(1)
    Integer uid;
    @Tag(2)
    String name;
    @Tag(3)
    String avatar;
    @Tag(4)
    String frame;
    @Tag(5)
    Integer lv;
    @Tag(6)
    Integer exp;
    @Tag(7)
    Boolean mc;
    @Tag(8)
    Boolean bmc;
    @Tag(9)
    String title;
    @Tag(10)
    Integer danscore;
}

}

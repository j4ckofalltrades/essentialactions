module com.stream_pi.twitch.setcoloraction {
    requires com.stream_pi.util;
    requires com.stream_pi.action_api;

    requires com.stream_pi.twitchchatconnectaction;
    requires Java.Twirk;

    provides com.stream_pi.action_api.normalaction.NormalAction with setcolor.SetColorAction;
}

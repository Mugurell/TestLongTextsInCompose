# TestLongTextsInCompose

There might be situations in which a `compose.material.Text` is set to show a very long text which could come either from a server response either be entered by the user.

Even when the `Text` is intended to only occupy the width of the screen that large text is still measured in it's entirety for the entire processing leading ot a crash or to multi-second slowdowns.

Maybe Compose can handle this situations a bit better.

&nbsp;

Opened https://issuetracker.google.com/issues/202863193 for more investigations.

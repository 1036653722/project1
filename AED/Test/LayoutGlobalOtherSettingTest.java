package io.github.subhamtyagi.lastlauncher;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
//CS304 (manually written) Issue link: https://github.com/SubhamTyagi/Last-Launcher/issues/135
public class LayoutGlobalOtherSettingTest {

    @Rule
    public ActivityTestRule<LauncherActivity> mActivityTestRule = new ActivityTestRule<>(LauncherActivity.class);

    @Test
    public void launcherActivityTest2() {
        ViewInteraction flowLayout = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout.perform(scrollTo(), longClick());

        ViewInteraction textView = onView(
                allOf(withId(R.id.settings_freeze_size), withText("Freeze Apps Size"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                14)));
        textView.perform(scrollTo(), click());

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.settings_freeze_size), withText("Unfreeze Apps Size"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                14)));
        textView2.perform(scrollTo(), click());

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.settings_hidden_apps), withText("Hidden Apps"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                16)));
        textView3.perform(scrollTo(), click());

        ViewInteraction flowLayout2 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout2.perform(scrollTo(), longClick());

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.settings_frozen_apps), withText("Frozen Apps"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                18)));
        textView4.perform(scrollTo(), click());

        ViewInteraction flowLayout3 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout3.perform(scrollTo(), longClick());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.settings_reset_to_defaults), withText("Reset to default Settings"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                24)));
        textView5.perform(scrollTo(), click());

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.settings_restart_launcher), withText("Restart Launcher"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                26)));
        textView6.perform(scrollTo(), click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}

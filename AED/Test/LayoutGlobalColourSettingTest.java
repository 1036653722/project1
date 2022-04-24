package io.github.subhamtyagi.lastlauncher;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
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
public class LayoutGlobalColourSettingTest {

    @Rule
    public ActivityTestRule<LauncherActivity> mActivityTestRule = new ActivityTestRule<>(LauncherActivity.class);

    @Test
    public void layoutGlobalSettingTest() {
        ViewInteraction flowLayout = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout.perform(scrollTo(), longClick());


        ViewInteraction textView3 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView3.perform(scrollTo(), click());

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.t1), withText("Default Theme"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                0),
                        isDisplayed()));
        textView4.perform(click());

        ViewInteraction flowLayout2 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout2.perform(scrollTo(), longClick());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView5.perform(scrollTo(), click());

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.t2), withText("Background Wallpaper"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                1),
                        isDisplayed()));
        textView6.perform(click());

        ViewInteraction flowLayout3 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout3.perform(scrollTo(), longClick());

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView7.perform(scrollTo(), click());

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.t3), withText("White on Black"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                2),
                        isDisplayed()));
        textView8.perform(click());

        ViewInteraction flowLayout4 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout4.perform(scrollTo(), longClick());

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView9.perform(scrollTo(), click());

        ViewInteraction textView10 = onView(
                allOf(withId(R.id.t4), withText("Black on White"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                3),
                        isDisplayed()));
        textView10.perform(click());

        ViewInteraction flowLayout5 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout5.perform(scrollTo(), longClick());

        ViewInteraction textView11 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView11.perform(scrollTo(), click());

        ViewInteraction textView12 = onView(
                allOf(withId(R.id.t5), withText("White on Grey"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                4),
                        isDisplayed()));
        textView12.perform(click());

        ViewInteraction flowLayout6 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout6.perform(scrollTo(), longClick());

        ViewInteraction textView13 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView13.perform(scrollTo(), click());

        ViewInteraction textView14 = onView(
                allOf(withId(R.id.t6), withText("Black on Grey"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                5),
                        isDisplayed()));
        textView14.perform(click());

        ViewInteraction flowLayout7 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout7.perform(scrollTo(), longClick());

        ViewInteraction textView15 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView15.perform(scrollTo(), click());

        ViewInteraction textView16 = onView(
                allOf(withId(R.id.t35), withText("Hacker Green"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                6),
                        isDisplayed()));
        textView16.perform(click());

        ViewInteraction flowLayout8 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout8.perform(scrollTo(), longClick());

        ViewInteraction textView17 = onView(
                allOf(withId(R.id.settings_themes), withText("Themes"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        textView17.perform(scrollTo(), click());

        ViewInteraction textView18 = onView(
                allOf(withId(R.id.t36), withText("Hacker Red"),
                        childAtPosition(
                                allOf(withId(R.id.theme_linear_layout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                7),
                        isDisplayed()));
        textView18.perform(click());

        ViewInteraction flowLayout9 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout9.perform(scrollTo(), longClick());

        ViewInteraction textView35 = onView(
                allOf(withId(R.id.settings_color_sniffer), withText("Random Colors"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                10)));
        textView35.perform(scrollTo(), click());

        ViewInteraction flowLayout12 = onView(
                allOf(withId(R.id.home_layout),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                0)));
        flowLayout12.perform(scrollTo(), longClick());

        ViewInteraction textView36 = onView(
                allOf(withId(R.id.settings_color_sniffer), withText("Fixed Colors"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                10)));
        textView36.perform(scrollTo(), click());
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

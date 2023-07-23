package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentMediaPlayerChapterListBinding implements ViewBinding {
    public final IncludeDialogHeaderBarBinding fragmentHeaderBar;
    public final LinearLayout mediaPlayerChapterListContainer;
    public final RecyclerView mediaPlayerChapterListRecyclerView;
    public final TextView mediaPlayerChapterListTitle;
    private final LinearLayout rootView;

    private FragmentMediaPlayerChapterListBinding(LinearLayout rootView, IncludeDialogHeaderBarBinding fragmentHeaderBar, LinearLayout mediaPlayerChapterListContainer, RecyclerView mediaPlayerChapterListRecyclerView, TextView mediaPlayerChapterListTitle) {
        this.rootView = rootView;
        this.fragmentHeaderBar = fragmentHeaderBar;
        this.mediaPlayerChapterListContainer = mediaPlayerChapterListContainer;
        this.mediaPlayerChapterListRecyclerView = mediaPlayerChapterListRecyclerView;
        this.mediaPlayerChapterListTitle = mediaPlayerChapterListTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMediaPlayerChapterListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentMediaPlayerChapterListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_media_player_chapter_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMediaPlayerChapterListBinding bind(View rootView) {
        int i = R.id.fragment_headerBar;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.fragment_headerBar);
        if (findChildViewById != null) {
            IncludeDialogHeaderBarBinding bind = IncludeDialogHeaderBarBinding.bind(findChildViewById);
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.mediaPlayer_chapterList_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.mediaPlayer_chapterList_recycler_view);
            if (recyclerView != null) {
                i = R.id.mediaPlayer_chapterList_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.mediaPlayer_chapterList_title);
                if (textView != null) {
                    return new FragmentMediaPlayerChapterListBinding(linearLayout, bind, linearLayout, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}

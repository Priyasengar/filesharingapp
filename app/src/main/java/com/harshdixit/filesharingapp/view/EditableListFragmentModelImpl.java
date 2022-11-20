package com.harshdixit.filesharingapp.view;

import com.harshdixit.filesharingapp.fragment.EditableListFragment;
import com.harshdixit.filesharingapp.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}

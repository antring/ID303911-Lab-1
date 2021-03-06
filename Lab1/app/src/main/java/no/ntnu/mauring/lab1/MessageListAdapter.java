package no.ntnu.mauring.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Antring on 18.09.2016.
 */


public class MessageListAdapter extends ArrayAdapter<Message> {
    public MessageListAdapter(Context context, ArrayList<Message> messages) {
        super(context, 0, messages);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.message_layout, parent, false);
        }

        TextView messageView = (TextView) convertView.findViewById(R.id.textView);

        messageView.setText(message.getUser() + ":\n" + message.getMessage());

        return convertView;
    }


}

package fr.wcs.blablawcs;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wilder on 13/03/18.
 */

public class SearchModel implements Parcelable {

    String departure;
    String destination;
    String Date;


    protected SearchModel(Parcel in) {
        departure = in.readString();
        destination = in.readString();
        Date = in.readString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(departure);
        parcel.writeString(destination);
        parcel.writeString(Date);
    }

    @Override
    public int describeContents() {
        return 0;
    }


    public static final Creator<SearchModel> CREATOR = new Creator<SearchModel>() {
        @Override
        public SearchModel createFromParcel(Parcel in) {
            return new SearchModel(in);
        }

        @Override
        public SearchModel[] newArray(int size) {
            return new SearchModel[size];
        }
    };

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }


    public SearchModel(String departure, String destination, String date) {
        this.departure = departure;
        this.destination = destination;
        Date = date;
    }




}

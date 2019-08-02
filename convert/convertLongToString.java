// 
public static String convertDateAndHour(long time){
    Date date = new Date(time);
    //Log.i("data","TimeStamp: " + time);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    String dataConvertida = df.format(date);
    return dataConvertida;
	// convertDateAndHour(obj.getDt_inc().getTimeInMillis());
}
	
	
//
public static String getFormatedDate(long milliSeconds) {
    Calendar cal = Calendar.getInstance(Locale.getDefault());
    cal.setTimeInMillis(milliSeconds * 1000);
    String date = DateFormat.format("dd/MM/yyyy", cal).toString();
    return date;
}

//
public static String convertHour(long time){
    Date date = new Date(time);
    //Log.i("data","TimeStamp: " + time);
    SimpleDateFormat df = new SimpleDateFormat("HH:mm");
    String dataConvertida = df.format(date);
    return dataConvertida;
}

//
public static String convertDate(long time){
    Date date = new Date(time);
    //Log.i("data","TimeStamp: " + time);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    String dataConvertida = df.format(date);
    return dataConvertida;
}

//
public static String convertDateAndHour(long time){
    Date date = new Date(time);
    //Log.i("data","TimeStamp: " + time);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    String dataConvertida = df.format(date);
    return dataConvertida;
}
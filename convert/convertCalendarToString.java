public static String getFormatedDate(long milliSeconds) {
    Calendar cal = Calendar.getInstance(Locale.getDefault());
    cal.setTimeInMillis(milliSeconds * 1000);
    String date = DateFormat.format("dd/MM/yyyy", cal).toString();
    return date;
}
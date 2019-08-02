//
String created_at = obj.getString("campo");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date date = sdf.parse(created_at);
Calendar calInc = Calendar.getInstance();
calInc.setTime(date);
in.setDt_inc(calInc);
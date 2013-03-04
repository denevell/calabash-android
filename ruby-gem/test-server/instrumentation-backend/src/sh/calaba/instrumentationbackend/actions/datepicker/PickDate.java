package sh.calaba.instrumentationbackend.actions.datepicker;


import sh.calaba.instrumentationbackend.InstrumentationBackend;
import sh.calaba.instrumentationbackend.Result;
import sh.calaba.instrumentationbackend.actions.Action;


public class PickDate implements Action {

    @Override
    public Result execute(String... args) {
		int index = Integer.valueOf(args[0]);
		int year = Integer.valueOf(args[1]);
		int monthOfYear= Integer.valueOf(args[2]);
		int dayOfMonth= Integer.valueOf(args[3]);
		InstrumentationBackend.solo.setDatePicker(index, year, monthOfYear, dayOfMonth);
        return Result.successResult();
    }

    @Override
    public String key() {
        return "set_date_picker1";
    }

}

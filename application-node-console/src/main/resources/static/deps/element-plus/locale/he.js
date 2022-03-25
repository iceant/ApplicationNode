/*! Element Plus v2.1.4 */

(function (global, factory) {
  typeof exports === 'object' && typeof module !== 'undefined' ? module.exports = factory() :
  typeof define === 'function' && define.amd ? define(factory) :
  (global = typeof globalThis !== 'undefined' ? globalThis : global || self, global.ElementPlusLocaleHe = factory());
})(this, (function () { 'use strict';

  var he = {
    name: "he",
    el: {
      colorpicker: {
        confirm: "\u05D0\u05D9\u05E9\u05D5\u05E8",
        clear: "\u05E0\u05E7\u05D4"
      },
      datepicker: {
        now: "\u05DB\u05E2\u05EA",
        today: "\u05D4\u05D9\u05D5\u05DD",
        cancel: "\u05D1\u05D8\u05DC",
        clear: "\u05E0\u05E7\u05D4",
        confirm: "\u05D0\u05D9\u05E9\u05D5\u05E8",
        selectDate: "\u05D1\u05D7\u05E8 \u05EA\u05D0\u05E8\u05D9\u05DA",
        selectTime: "\u05D1\u05D7\u05E8 \u05D6\u05DE\u05DF",
        startDate: "\u05EA\u05D0\u05E8\u05D9\u05DA \u05D4\u05EA\u05D7\u05DC\u05D4",
        startTime: "\u05D6\u05DE\u05DF \u05D4\u05EA\u05D7\u05DC\u05D4",
        endDate: "\u05EA\u05D0\u05E8\u05D9\u05DA \u05E1\u05D9\u05D5\u05DD",
        endTime: "\u05D6\u05DE\u05DF \u05E1\u05D9\u05D5\u05DD",
        prevYear: "Previous Year",
        nextYear: "Next Year",
        prevMonth: "Previous Month",
        nextMonth: "Next Month",
        year: "",
        month1: "\u05D9\u05E0\u05D5\u05D0\u05E8",
        month2: "\u05E4\u05D1\u05E8\u05D5\u05D0\u05E8",
        month3: "\u05DE\u05E8\u05E5",
        month4: "\u05D0\u05E4\u05E8\u05D9\u05DC",
        month5: "\u05DE\u05D0\u05D9",
        month6: "\u05D9\u05D5\u05E0\u05D9",
        month7: "\u05D9\u05D5\u05DC\u05D9",
        month8: "\u05D0\u05D5\u05D2\u05D5\u05E1\u05D8",
        month9: "\u05E1\u05E4\u05D8\u05DE\u05D1\u05E8",
        month10: "\u05D0\u05D5\u05E7\u05D8\u05D5\u05D1\u05E8",
        month11: "\u05E0\u05D5\u05D1\u05DE\u05D1\u05E8",
        month12: "\u05D3\u05E6\u05DE\u05D1\u05E8",
        weeks: {
          sun: "\u05D0\u05F3",
          mon: "\u05D1\u05F3",
          tue: "\u05D2\u05F3",
          wed: "\u05D3\u05F3",
          thu: "\u05D4\u05F3",
          fri: "\u05D5\u05F3",
          sat: "\u05E9\u05D1\u05EA"
        },
        months: {
          jan: "\u05D9\u05E0\u05D5\u05D0\u05E8",
          feb: "\u05E4\u05D1\u05E8\u05D5\u05D0\u05E8",
          mar: "\u05DE\u05E8\u05E5",
          apr: "\u05D0\u05E4\u05E8\u05D9\u05DC",
          may: "\u05DE\u05D0\u05D9",
          jun: "\u05D9\u05D5\u05E0\u05D9",
          jul: "\u05D9\u05D5\u05DC\u05D9",
          aug: "\u05D0\u05D5\u05D2\u05D5\u05E1\u05D8",
          sep: "\u05E1\u05E4\u05D8\u05DE\u05D1\u05E8",
          oct: "\u05D0\u05D5\u05E7\u05D8\u05D5\u05D1\u05E8",
          nov: "\u05E0\u05D5\u05D1\u05DE\u05D1\u05E8",
          dec: "\u05D3\u05E6\u05DE\u05D1\u05E8"
        }
      },
      select: {
        loading: "\u05D8\u05D5\u05E2\u05DF",
        noMatch: "\u05DC\u05D0 \u05E0\u05DE\u05E6\u05D0\u05D5 \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD",
        noData: "\u05DC\u05DC\u05D0 \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD",
        placeholder: "\u05D1\u05D7\u05E8"
      },
      cascader: {
        noMatch: "\u05DC\u05DC\u05D0 \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD \u05DE\u05EA\u05D0\u05D9\u05DE\u05D9\u05DD",
        loading: "\u05D8\u05D5\u05E2\u05DF",
        placeholder: "\u05D1\u05D7\u05E8",
        noData: "\u05DC\u05DC\u05D0 \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD"
      },
      pagination: {
        goto: "\u05E2\u05D1\u05D5\u05E8 \u05DC",
        pagesize: "/page",
        total: "\u05DB\u05D5\u05DC\u05DC {total}",
        pageClassifier: ""
      },
      messagebox: {
        title: "\u05D4\u05D5\u05D3\u05E2\u05D4",
        confirm: "\u05D0\u05D9\u05E9\u05D5\u05E8",
        cancel: "\u05D1\u05D8\u05DC",
        error: "\u05E7\u05DC\u05D8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF"
      },
      upload: {
        deleteTip: "press delete to remove",
        delete: "\u05DE\u05D7\u05E7",
        preview: "\u05EA\u05E6\u05D5\u05D2\u05D4 \u05DE\u05E7\u05D3\u05D9\u05DE\u05D4",
        continue: "\u05D4\u05DE\u05E9\u05DA"
      },
      table: {
        emptyText: "\u05D0\u05D9\u05DF \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD",
        confirmFilter: "\u05D0\u05D9\u05E9\u05D5\u05E8",
        resetFilter: "\u05E0\u05E7\u05D4",
        clearFilter: "\u05D4\u05DB\u05DC",
        sumText: "\u05E1\u05DA"
      },
      tree: {
        emptyText: "\u05D0\u05D9\u05DF \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD"
      },
      transfer: {
        noMatch: "\u05D0\u05D9\u05DF \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD \u05DE\u05EA\u05D0\u05D9\u05DE\u05D9\u05DD",
        noData: "\u05DC\u05DC\u05D0 \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD",
        titles: ["\u05E8\u05E9\u05D9\u05DE\u05D4 1", "\u05E8\u05E9\u05D9\u05DE\u05D4 2"],
        filterPlaceholder: "\u05D4\u05E7\u05DC\u05D3",
        noCheckedFormat: "\u05E4\u05E8\u05D9\u05D8\u05D9\u05DD {total}",
        hasCheckedFormat: " \u05D0\u05D9\u05E9\u05D5\u05E8 {checked}/{total}"
      },
      image: {
        error: "FAILED"
      },
      pageHeader: {
        title: "Back"
      },
      popconfirm: {
        confirmButtonText: "Yes",
        cancelButtonText: "No"
      }
    }
  };

  return he;

}));

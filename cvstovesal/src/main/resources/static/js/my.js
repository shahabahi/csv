//Callback handler for form submit event
$("#frmManyToMany").submit(function (e) {

    var formObj = $(this);
    var formURL = formObj.attr("action");
    var formData = new FormData(this);
    $.ajax({
        url: formURL,
        type: 'POST',
        data: formData,
        mimeType: "multipart/form-data",
        contentType: false,
        cache: false,
        processData: false,
        success: function (result) {

        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(errorThrown);
        }
    });
    e.preventDefault(); //Prevent Default action.
});
$("#frmManyToMany").submit(); //Submit the form



var status = setInterval(function () {
    getstatus();
}, 5000);

function getstatus() {
    $.ajax({
        type: "POST",
        url: '/status',
        success: function (result) {
            if (result.outStr == 'Finish') {
                clearInterval(status);
                $("#lprogress").css("width", "100%");
            }
            $("#lstatus").val( result.time + ': ' + result.outStr );
            $(".progress-bar").css("width", result.percentage+"%");
            $('span#complete').html(result.percentage+"%" );

        },
        error: function (jqXHR, textStatus, errorThrown) {
            clearInterval(status);
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }

    });
}

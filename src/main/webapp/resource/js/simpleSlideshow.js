var cursor = -1;
var ended = false;
var slides = [{"title":"Microsoft Internet Explorer","image":"pub.png","description":"Internet Explorer 10 exploite la puissance insoupçonnée de votre PC","url":"http://windows.microsoft.com/fr-FR/internet-explorer/download-ie"},
			  {"title":"Google Chrome","image":"pub3.jpg","description":"Un navigateur web rapide et gratuit","url":"http://www.google.fr/intl/fr/chrome/browser/"},
			  {"title":"Google Chrome","image":"pub2.jpg","description":"Un navigateur web rapide et gratuit","url":"http://www.google.fr/intl/fr/chrome/browser/"},
			  
			  ];
var animation = null;

$('document').ready(function(){
	intervalLoader();
	animation = setInterval("intervalLoader()",5000);
	
	//manually change slide
	$('#slides li').click(function(){
		if(!ended){ 
			ended = true;
			clearInterval(animation);
		}			
		
		$('#slides li').eq(cursor).removeClass('selected');
		cursor = $(this).index();
		changeSlide(cursor);
	});
	
	// clicks event
	$('#imgSlide, #slideText, #slideTitle').click(function(){
		window.open(slides[cursor]['url'],'_blank');
		clearInterval(animation);
	});

});

// preloading image
function preloadSlide(obj){
	var pic = new Image();
	pic.src = "resource/images/" + obj['image'];
	return pic;
}

function changeSlide(index){
		// current li change style
		$('#slides li').eq(index).addClass('selected');
		$('#slides li').eq(index - 1).removeClass('selected');

		// disappear effect
		$('#slideTitle').fadeOut(400);
		$('#slideText').fadeOut(400);
		$('#imgSlide').fadeOut(600, function(){  
		// change slide
		var nextPic = preloadSlide(slides[index]);
		$('#imgSlide').attr('src', nextPic.src);
		$('#slideTitle').html(slides[index]['title']);
		$('#slideText').html(slides[index]['description']);
		// appear effect
		$('#slideTitle').fadeIn(400);
		$('#slideText').fadeIn(400);
		$('#imgSlide').fadeIn(400);
		});
}

function intervalLoader(){
	if(cursor < slides.length - 1){
		cursor++;
	}else{
		cursor = 0;
		clearInterval(animation);
	}
	
	if(!ended){
		changeSlide(cursor);
	}
	
}
package com.techafresh.animationx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rommansabbir.animationx.Attention
import com.rommansabbir.animationx.Bounce
import com.rommansabbir.animationx.Fade
import com.rommansabbir.animationx.Flip
import com.rommansabbir.animationx.Rotate
import com.rommansabbir.animationx.Slide
import com.rommansabbir.animationx.Zoom
import com.rommansabbir.animationx.animationXAttention
import com.rommansabbir.animationx.animationXBounce
import com.rommansabbir.animationx.animationXFade
import com.rommansabbir.animationx.animationXFlip
import com.rommansabbir.animationx.animationXRotate
import com.rommansabbir.animationx.animationXSlide
import com.rommansabbir.animationx.animationXZoom
import com.techafresh.animationx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBOUNCEIN.setOnClickListener {
            binding.buttonX.animationXBounce(Bounce.BOUNCE_IN)
        }
        binding.buttonFADEINDOWN.setOnClickListener {
            binding.buttonX.animationXFade(Fade.FADE_IN_DOWN)
        }
        binding.buttonFLIPINX.setOnClickListener {
            binding.buttonX.animationXFlip(Flip.FLIP_IN_X)
        }
        binding.buttonROTATEIN.setOnClickListener {
            binding.buttonX.animationXRotate(Rotate.ROTATE_IN)
        }
        binding.buttonSLIDEINDOWN.setOnClickListener {
            binding.buttonX.animationXSlide(Slide.SLIDE_IN_DOWN)
        }
        binding.buttonZOOMINLEFT.setOnClickListener {
            binding.buttonX.animationXZoom(Zoom.ZOOM_IN_LEFT)
        }

        binding.buttonATTENTIONBOUNCE.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_BOUNCE)
        }

        binding.buttonATTENTIONPULSE.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_PULSE)
        }

        binding.buttonATTENTIONFLASH.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_FLASH)
        }

        binding.buttonATTENTIONRUBERBAND.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_RUBERBAND)
        }

        binding.buttonATTENTIONSHAKE.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_SHAKE)
        }

        binding.buttonATTENTIONSTANDUP.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_STAND_UP)
        }

        binding.buttonATTENTIONSWING.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_SWING)
        }

        binding.buttonATTENTIONTADA.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_TA_DA)
        }

        binding.buttonATTENTIONWAVE.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_WAVE)
        }

        binding.buttonWobble.setOnClickListener {
            binding.buttonX.animationXAttention(Attention.ATTENTION_WOBBLE)
        }

    }
}